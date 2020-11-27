package basicStu;

import java.math.BigInteger;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String department;
    private String position;
    private int sales;

    @Override
    public int compareTo(Student o) {
        //정렬에 있어서 앞에 오고 싶을 때 음수를 내보내면 됨.
        //return this.name.compareTo(o.name);
        //return this.id - o.id; 만일 사번이 기준이라면 ??
        return this.sales - o.sales;
    }

    public Student(int id, String name, String department, String position, int sales) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.position = position;
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", sales=" + sales +
                '}';
    }
}
