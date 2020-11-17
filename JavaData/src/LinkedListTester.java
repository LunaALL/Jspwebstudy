import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.Scanner;

public class LinkedListTester {

    static Scanner std = new Scanner(System.in);

    static class Data{
        static final int N0=1;  //번호를 입력 받을 때
        static final int NAME=2; //이름을 입력받을 때

        private Integer no; //회원 번호
        private String name; //회원 이름

        @Override
        public String toString() {
            //회원 번호 , 이름 반환
            return "(" + no + ")" + name;
        }
        //데이터 입력용
        void scanData(String guide, int sw){
            System.out.println(guide + "할 데이터를 입력하셈.");

            if ((sw & N0)==N0 ){
                System.out.print("번호 :");
                no = std.nextInt();
            }
            if ((sw & NAME) == NAME) {
                System.out.print("이름");
                name = std.nextLine();
            }
        }

        //데이터 정렬. 회원번호 기준.
        public static final Comparator<Data> NO_ORDER = new NoOrderComparator();

        private static class NoOrderComparator implements Comparator <Data> {
            @Override
            public int compare(Data o1, Data o2) {
                return (o1.no > o2.no) ? 1: (o1.no < o2.no) ? -1:0;
            }
        }

        //메뉴 열거형형
       enum Menu{
            ADD_FIRST("머리에 노드를 삽입"),
            ADD_LAST("꼬리에 노드를 삽입"),
            RMV_FIRST("머리 노드를 삭제"),
            RMV_LAST( "꼬리 노드를 삭제"),
            RMV_CRNT("선택 노드를 삭제"),
            CLEAR( "모든 노드를 삭제"),
            SEARCH_NO(  "번호로 검색"),
            SEARCH_NAME("이름으로 검색"),
            NEXT( "선택 노드를 하나 뒤쪽으로 이동"),
            PRINT_CRNT("선택 노드를 출력"),
            DUMP( "모든 노드를 출력"),
            TERMINATE( "종료");

            private final String message;

            static Menu MenuAt(int idx) {
                for (Menu m : Menu.values()){
                    if (m.ordinal() ==idx)
                        return m;
                }
                return null;
            }

            //생성자
            Menu(String string){
                message = string;
            }
            //출력할 문자열을 반환.
            String getMessage() {
                return message;
            }
        }

        //메뉴
        static Menu SelectMenu() {
            int key;
            do {
                for (Menu m : Menu.values()) {
                    System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
                    if ((m.ordinal() % 3) == 2 &&
                            m.ordinal() != Menu.TERMINATE.ordinal())
                        System.out.println();
                }
                System.out.print("：");
                key = std.nextInt();
            } while (key < Menu.ADD_FIRST.ordinal() ||
                    key > Menu.TERMINATE.ordinal());
            return Menu.MenuAt(key);
        }


    }


}
