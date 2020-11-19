package basicStu;
enum  Season {
    봄, 여름 ,가을 ,겨울
}


public class Enumtest {
    public static void main(String[] args) {
        Season se= Season.가을;
        System.out.println(se);
        //몇번째 데이터인지
        System.out.println(se.ordinal());

        for (Season sea: Season.values()
             ) {
            System.out.println(sea);
        }
    }



}
