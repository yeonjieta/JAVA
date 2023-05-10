package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class MySession implements Runnable {
	
	private Scanner sc;
	private Socket so;
	
	public MySession(Socket so) throws IOException{
		this.so = so;
		sc = new Scanner(so.getInputStream());
		// socket으로부터 들어오는 입력값을 저장
	} // 각 클라이언트들은 자신만의 MySession 객체를 가지고 서버와 통신
	@Override
	public void run() {	// 접속한 클라이언트가 보낸 메시지를 내 컴퓨터에 출력하기
		// Thread 클래스에서 실행될 코드를 작성하는 메서드
		String msg = "";
		while(true) {
			msg = sc.nextLine();		// 클라이언트가 보낸 메시지를 읽어서
			if("exit".equals(msg)) {
				
				break;
			}
			System.out.println(msg);	// 내 화면(서버)에 출력하기
		}
		sc.close();
		try { so.close(); } catch(Exception e) {} 
		// 클라이언트 소캣 닫기
	}
}
public class Server {
	public static void main(String[] args) throws Exception{
		
		ServerSocket ss = null;
		PrintWriter pw = null;
		Socket so = null;
		Scanner sc = new Scanner(System.in);
		String msg;
		
		ss = new ServerSocket(7777); // 서버 소캣 생성
		System.out.println("접속 대기중...");
		so = ss.accept(); // 클라이언트와 연결되면 소켓 반환
		pw = new PrintWriter(so.getOutputStream());
		// 소켓으로부터 출력스트림 가져오기
		
		MySession session = new MySession(so);
		// MySession클래스 생성자에 객체 so를 전달 
		Thread th = new Thread(session);
		th.start();
		
		// 내가 입력한 메시지를 클라이언트에게 보내는 코드
		while(true) {
			System.out.print("보낼 메시지 입력 : ");
			msg = sc.nextLine();
			pw.println(msg);
			pw.flush();
			// PrintWriter 객체를 통해 해당 메시지를 클라이언트로 보냄
			if("exit".equals(msg)) {
				break;
			}
		}
		sc.close();
		pw.close();
		ss.close();
		so.close();
	}
}

// pw.flush();
// 버퍼에 있는 데이터를 출력 스트림으로 모두 내보내는 역할
// PrintWriter 객체는 출력 시에 버퍼링을 하기 때문에, println() 메서드를 호출하더라도 바로 출력되지 않을 수 있다. 
// 이때 flush() 메서드를 호출함으로써 버퍼에 있는 데이터를 모두 출력
