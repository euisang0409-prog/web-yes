package ex_0410;

import java.util.*;

public class Listset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        // 1. 입력받기
        while(true) {
            String input = sc.nextLine();

            if(input.equals("exit")) {
                break;
            }

            list.add(input);
        }

        // 2. 중복 제거 (List → Set)
        Set<String> set = new HashSet<>(list);

        // 3. Set → List 변환
        List<String> result = new ArrayList<>(set);

        // 4. 정렬
        Collections.sort(result);

        // 5. 출력
        for(String s : result) {
            System.out.println(s);
        }
    }
}