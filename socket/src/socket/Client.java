package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class ClientOutput implements Runnable {
	private Socket so;
	private PrintWriter pw;
	private Scanner sc;
	
	public ClientOutput(Socket so, Scanner sc) throws IOException {
		
		this.so = so;
		this.sc = sc;
		pw = new PrintWriter(so.getOutputStream());
	}
	
	@Override
	public void run() {
		String msg = "";
		while(true) {
            // 사용자 입력을 받아 서버로 전송하는 루프
			System.out.print("보낼 메시지 입력 : ");
			msg = sc.nextLine();
			pw.println(msg);  // 메시지를 서버로 보내기
			pw.flush(); // 버퍼에 있는 내용 전송
			if("exit".equals(msg)) {
				break;
			}
		}
		pw.close(); // PrintWriter 객체 닫기
		try { so.close(); } catch(Exception e) {}
	}
}

public class Client {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		String host, msg;
		int port = 7777;
		Socket so;
		Scanner server;
		
		System.out.print("접속할 서버의 아이피 입력 : ");
		host = sc.nextLine();
		
		so = new Socket(host, port); // 서버 접속 위한 소캣 객체 생성
		ClientOutput out = new ClientOutput(so, sc); // 사용자 입력처리를 위한 객체 생성
		Thread th = new Thread(out);
		th.start();
		server = new Scanner(so.getInputStream());
		// 서버에서 전송되는 데이터를 받기 위한 Scanner 객체 생성
		
		while(true) {
			msg = server.nextLine();
			// 서버에서 전송되는 메시지를 받아 출력
			System.out.println(msg);
			if(msg.equals("exit") ) {
				break;
			}
		}
		
		server.close();
		sc.close();
		so.close();
	}
}
// 클라이언트 측에서 입력한 메시지를 출력하기 위해 ClientOutput 클래스가 따로 존재하고, 
// run()메서드에서 pw.println(msg)로 메시지를 서버로 전송
// 서버 측에서는 클라이언트가 보낸 메시지를 받아서 출력하는 MySession 클래스가 따로 존재 
// MySession 클래스의 run() 메서드에서 msg = sc.nextLine()으로 클라이언트가 보낸 메시지를 읽어들임
// 이 두 클래스가 각각 별개의 스레드에서 실행