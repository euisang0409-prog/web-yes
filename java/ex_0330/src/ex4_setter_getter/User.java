package ex4_setter_getter;

public class User {
	
//	User 클래스를 작성한다.
//	필드
//	- 문자열 : username
//	- 문자열 : password
//	- 문자열 : email
//
//	setter&getter를 이용해서 필드의 값을 세팅하거나 가져올 수 있다.
//	- username은 4글자 이상
//	ㄴ "아이디는 4글자 이상이어야 합니다"
//	- password는 6글자 이상
//	ㄴ " 비밀번호는 6글자 이상이어야 합니다.
//	- email은 @를 포함해야한다.
//	ㄴ "이메일 오류"

	private String username;
	private String password;
	private String email;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		if(username.length() >=4) {
			this.username = username;
		}else {
			System.out.println("아이디는 4글자 이상");
		}
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.length() >= 6) {
			this.password = password;
		}else {
			System.out.println(" 비밀번호는 6글자 이상이어야 합니다.");
		}
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.contains("@")) {
			this.email = email;
		}else
			System.out.println("이메일 형식 오류");
		
	}
	
	
	
	
	
	
	
	
	
	
	
//	public void setName(String name) {
//		if(name.length() > 4) {
//			this.name = name;
//		}else {
//			System.out.println("아이디는 4글자 이상이어야 합니다");
//		}
//	
//	public String getName(String name) {
//		return name;
//	}
//	
//	public void setPassword(String password) {
//		if(password.length() > 6) {
//			this.password = password;
//		}else {
//			System.out.println("비밀번호는 6글자 이상이어야 합니다.");
//		}
//	}
//	
//	public String getName(password name) {
//		return name;
//	}
	
	
	
	
	
	
}
