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

        System.out.println(s2.toString());
        System.out.println(s1.toString());

    }
}
