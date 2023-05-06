package testlogin;

import java.sql.*;

public class LoginDTO {
	
		
		private String id;
		private int pw;
		private String nickname;
		
		@Override
		public String toString() {
			return String.format("%s, %d, %s", id, pw, nickname);
		}
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public int getPw() {
			return pw;
		}
		public void setPw(int pw) {
			this.pw = pw;
		}
		public String getnickName() {
			return nickname;
		}
		public void setnickName(String nickname) {
			this.nickname = nickname;
		}
		
		
		
		
	

}
