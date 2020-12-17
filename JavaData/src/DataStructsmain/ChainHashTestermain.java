package DataStructsmain;

import java.util.Scanner;

public class ChainHashTestermain {
    static Scanner stdIn = new Scanner(System.in);

    static class Data {
        static final int NO = 1;
        static final int NAME = 2;

        private Integer no;
        private String name;

        Integer keyCode() {
            return NO;
        }

        @Override
        public String toString() {
            return "ChainHashTestermain{" +
                    "name='" + name + '\'' +
                    '}';
        }

        void scanData(String guide, int sw) {
            System.out.println(guide + "할 데이터를 입력하세요");

            if ((sw & NO) == NO) {
                System.out.print("번호 : ");
                no = stdIn.nextInt();
            }
            if ((sw & NAME) == NAME) {
                System.out.print("이름 : ");
                name = stdIn.next();
            }
        }
    }

    // 메뉴 열거형
    enum Menu {
        ADD("추가"),
        REMOVE("삭제"),
        SEARCH("검색"),
        DUMP("출력"),
        TERMINATE("종료");

        private final String message;        // 나타낼 문자열

        static Menu MenuAt(int idx) {        // 서수가 idx인 열거를 반환
            for (Menu m : Menu.values())
                if (m.ordinal() == idx)
                    return m;
            return null;
        }

        Menu(String string) {                // 생성자
            message = string;
        }

        String getMessage() {                // 나타낼 문자열을 반환
            return message;
        }
    }


}
