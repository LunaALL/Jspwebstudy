package Quiz;

import java.util.Scanner;

public class RecurQui1 {

    static void recur(int n){
        if(n>0){
            //System.out.println("recur(n-1)="+ (n-1) );
            recur(n-1 );
            System.out.println("n="+n);
            recur(n-2);
        }
    }

    public static void main(String[] args) {
        //recur(4);

        recur(3);
    }
}
