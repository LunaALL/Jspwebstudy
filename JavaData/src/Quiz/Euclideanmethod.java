package Quiz;

import java.util.Scanner;

public class Euclideanmethod {
    //유클리드 호제법 알고리즘을 사용하여 최대공약수 구하기
    static int gcd(int x, int y){
        //재귀를 진행하며, x%y가 0일 경우 x를 그대로 반환한다. (인자는 y가 들어오게됨)
        if(y==0) {

            return x;
        }else{
            System.out.println("x="+x+" y= "+y +" x%y= "+(x%y));
            return gcd(y, x%y);
        }
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);

        System.out.println("두 정수의 최대 공약수를 구합니다.");

        System.out.println("정수 입력: "); int x= std.nextInt();
        System.out.println("두번째 정수 입력"); int y= std.nextInt();

        System.out.println("최대공약수는 "+ gcd(x,y)+"입니다");



    }
}
