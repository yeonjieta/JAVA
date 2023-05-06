package testlogin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	// 회원가입(id, pw, nickname)
	// login, logout(null 처리로 해결)
	// 회원정보 수정
	// 회원 탈퇴 
	// 로그인 되지 않은 상태에서는 로그인과 회원가입만
	// 로그인 시에는 로그아웃, 회원정보수정, 회원탈퇴가 떠야함
	
	Scanner sc = new Scanner(System.in);
	LoginDAO dao = new LoginDAO();
	LoginDTO tmp = null;
	ArrayList<LoginDTO> list; 
	// ProductDTO 객체만을 요소로 갖는 리스트를 생성
	int menu, row;
	String inputId, newId, newnickName;
	int inpuPw, newPw;
	
	while(true) {
		if(tmp == null) {
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		System.out.println("0.선택 >>>");
		
		menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1 :
			tmp = useBean(sc);
			row = dao.insert(tmp);
			System.out.println(row != 0 ? "회원가입 성공" : "회원가입 실패");
			break;
		
		case 2: 
			System.out.print("아이디 입력 : ");
			inputId = sc.nextLine();
			System.out.print("비밀번호 입력 : ");
			inpuPw = Integer.parseInt(sc.nextLine());
			
			tmp = dao.loginId(inputId);
			
//			if(inputId.equals(tmp.getId())) 
			if(tmp != null){
				if(inpuPw == tmp.getPw()) {
					System.out.println("로그인성공");
				}
				else {
					System.out.println("비밀번호 불일치");
				}
			}
			else {
				System.out.println("아이디 불일치");
			}
			break;
		}
		} else {
			System.out.println("3.회원정보 수정");
			System.out.println("4.로그아웃");
			System.out.println("5.회원탈퇴");
			System.out.println("0.선택 >>>");
			
		
			menu = Integer.parseInt(sc.nextLine());
		switch(menu) {
		
		case 3:
			System.out.print("수정할 회원 아이디 : ");
			inputId = sc.nextLine();
			System.out.print("변경할 아이디 : ");
			newId = sc.nextLine();
			System.out.print("변경할 비밀번호 : ");
			newPw = Integer.parseInt(sc.nextLine());
			System.out.print("변경할 닉네임 : ");
			newnickName = sc.nextLine();
			
			row = dao.update(newId,newPw,newnickName, inputId);
			System.out.println(row != 0 ? "수정성공" : "수정실패");
			break;
			
		case 4:
			tmp = null;
			System.out.println("로그아웃");
			
			break;
			
		case 5:
			System.out.println("탈퇴할 회원 아이디 : ");
			inputId = sc.nextLine();
			
			row = dao.delete(inputId);
			System.out.println(row != 0? "탈퇴성공" : "탈퇴실패");
			break;
			
			
		}
		}
			
		
	}
	}
	static LoginDTO useBean(Scanner sc) {
		LoginDTO dto = new LoginDTO();
		// LoginDTO 객채 생성
		System.out.print("ID입력 : ");
		dto.setId(sc.nextLine());
		
		System.out.print("PW입력 : ");
		dto.setPw(Integer.parseInt(sc.nextLine()));
		
		System.out.print("닉네입입력 : ");
		dto.setnickName(sc.nextLine());
		
		return dto;
		
	}
}


