package ex1_innerclass.staticclass;
// Builder 패턴
// 객체를 만들 때 생성과정을 단계적으로 분리하는 설계 방식
public class User {

    private String id;
    private String password;
    private String name;
    private String email;
    private int age;
    private String address;
    private String phone;

    // 생성자는 private
    private User(Builder builder) {
        this.id = builder.id;
        this.password = builder.password;
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.address = builder.address;
        this.phone = builder.phone;
    }

    // Builder 클래스
    public static class Builder {
        private String id;
        private String password;
        private String name;
        private String email;
        private int age;
        private String address;
        private String phone;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
    
	}
