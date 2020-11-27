import basicStu.Student;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main1Test {
    public static void main(String[] args) {
        /*
        LinkedList<Integer> L1= new LinkedList<>();
        L1.addFirst(10);
        L1.addFirst(20);
        L1.addFirst(30);

        L1.printCurrentNode();
        L1.removeFirst();
        L1.printCurrentNode();
        String a1= "이거 갖고 놀자 ";
        StringBuilder sb =new StringBuilder(a1);
         sb.reverse();
        System.out.println(sb);

         */

        Student st1 = new Student(1, "jdk", "솔루션1","연구원",new BigInteger("2800"));
        Student st2 = new Student(2, "bab", "솔루션1","연구원",new BigInteger("3200"));
        Student st3 = new Student(3, "amateur", "솔루션1","연구원",new BigInteger("5500"));
        Student st4 = new Student(4, "jeong", "솔루션1","연구원",new BigInteger("6500"));
        Student st5 = new Student(5, "pro", "솔루션1","연구원",new BigInteger("7000"));

        List<Student> employ= new LinkedList<>();
        employ.add(st2);
        employ.add(st3);
        employ.add(st1);
        employ.add(st4);
        employ.add(st5);
        System.out.println(employ.get(0));
        System.out.println(employ.get(1));
        System.out.println(employ.get(2));
        System.out.println(employ.get(3));
        System.out.println(employ.get(4));
        Collections.sort(employ);
        System.out.println("####");
        System.out.println(employ);



    }
}
