package Quiz;

import java.util.Scanner;

public class SentinalSearch {

    static int 보초검색(int[] arr, int leng, int key){
        arr[leng]=key;

        int i=0;
        while(true){
            if(arr[i]==key){
                break;
            }
            i++;
        }

        return i==leng ? -1 : i ;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("요소수 입력");
        int arrlen=sc.nextInt();
        int[] arr= new int[arrlen+1];
        for(int i=0 ; i<arrlen;i++){
            System.out.println(i+"번째 요소수 입력: ");
            arr[i]= sc.nextInt();
        }

        System.out.println("검색할 값 ? ");
        int search= sc.nextInt();

        int idx= 보초검색(arr, arrlen, search);
        System.out.println("값을 찾은 위치는 (음수일 때 false) "+ idx);



    }

}

