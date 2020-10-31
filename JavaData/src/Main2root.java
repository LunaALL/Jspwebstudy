import DataStructs.IntSet;

public class Main2root {

    public static void main(String[] args) {
        IntSet s1 = new IntSet(10);
        IntSet s2 = new IntSet(10);
        IntSet s3 = new IntSet(10);

        s1.add(10);
        s1.add(15);
        s1.add(20);
        s1.add(25);

        s1.copyTo(s2);
        s2.add(12);
        s2.remove(25);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s2.indexOf(25));

        System.out.println("집합 s1에 15는" + (s1.contains(15) ? "포함됩니다." : "포함되지 않습니다." ) );

        System.out.println(s1.equalTo(s2) ? "서로 같습니다": "서로 다른 집합입니다.");
        s2.copyTo(s3);
        System.out.println(s2.equalTo(s3)? "서로 같습니다." : "서로 다른 집합입니다.");
    }
}
