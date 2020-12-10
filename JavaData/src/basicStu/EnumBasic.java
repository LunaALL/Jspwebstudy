package basicStu;

enum Animal{
    DOG, CAT, BEAR;
}

enum Person{
    MAN, WOMAN, BABY;
}


public class EnumBasic {
    public static void main(String[] args) {
        whoAreYou(Person.MAN);

        Person myFriend= Person.WOMAN;

        /*
        if(myFriend == Animal.CAT)
            System.out.println("고양이");
        else
            System.out.println("고양이 인줄 알았다. ");

            인터페이스 상수형을 썼으면 오류없이 그대로 실행이 가능함.

            사람과 동물 비교가 됨.
         */
    }


    public static void whoAreYou(Person man){
        switch (man){
            case MAN:
                System.out.println("남자 손님입니다.");
                break;
            case WOMAN:
                System.out.println("여성 손님입니다.");
                break;
            case BABY:
                System.out.println("아기 손님입니다.");
                break;
        }
    }


}
