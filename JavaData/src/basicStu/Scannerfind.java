package basicStu;

import java.util.Scanner;

public class Scannerfind {

    public static void main(String[] args) {
        String source= "1 4 5 3 strsing";
        Scanner sc = new Scanner(source);

        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();

        String s1 = sc.nextLine();

        System.out.println(num1+ num2+num3);
        System.out.println(s1);
    }
}
