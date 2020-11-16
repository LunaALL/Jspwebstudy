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
    }


}
