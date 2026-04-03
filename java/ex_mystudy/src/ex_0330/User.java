package ex_0330;

class User {

    // 1. 필드 (private)
    private String username;
    private String password;
    private String email;

    // 2. setter - username
    public void setUsername(String username) {
        if (username.length() < 4) {
            System.out.println("아이디는 4글자 이상이어야 합니다");
        } else {
            this.username = username;
        }
    }

    // 3. setter - password
    public void setPassword(String password) {
        if (password.length() < 6) {
            System.out.println("비밀번호는 6글자 이상이어야 합니다");
        } else {
            this.password = password;
        }
    }

    // 4. setter - email
    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("이메일 오류");
        } else {
            this.email = email;
        }
    }

    // 5. getter
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
	
	
	

