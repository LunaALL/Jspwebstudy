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


    }


}
