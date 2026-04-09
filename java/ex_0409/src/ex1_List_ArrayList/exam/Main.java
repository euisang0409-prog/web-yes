package ex1_List_ArrayList.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<UserInfo> list = new ArrayList<>();

        for(int i = 0; i < 3; i++) {

            UserInfo user = new UserInfo();

            System.out.print("아이디 입력: ");
            String id = sc.next();   //  (변수에 저장)

            //  중복 체크
            boolean isDuplicate = false;

            for(UserInfo u : list) {
                if(u.getId().equals(id)) {
                    isDuplicate = true;
                    break;
                }
            }

            if(isDuplicate) {
                System.out.println("중복된 아이디입니다. 다시 입력하세요.");
                i--; // 다시 입력
                continue;
            }

            user.setId(id);

            System.out.print("비밀번호 입력: ");
            user.setPassword(sc.next());

            list.add(user);

            System.out.println();

            // 입력할 때마다 전체 출력
            for(UserInfo u : list) {
                System.out.println(u.getId());
                System.out.println(u.getPassword());
                System.out.println("---------");
            }
        }

        sc.close();
    }
}
