package basicStu;

import java.math.BigInteger;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String department;
    private String position;
    private BigInteger sales;

    @Override
    public int compareTo(Student o) {
        //정렬에 있어서 앞에 오고 싶을 때 음수를 내보내면 됨. 
        return 0;
    }
}
