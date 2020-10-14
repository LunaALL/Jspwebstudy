package DataStructs;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {5,22,35,43,61,70};
        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 키 값 :");
        int key= sc.nextInt();

        int idx= Arrays.binarySearch(arr,key);

        if(idx<0){
            System.out.println("찾는 요소가 배열에 존재하지 않음");
        }else{
            System.out.println("배열 "+idx+ " 위치에서 찾았읍니다.");
        }
    }

}
