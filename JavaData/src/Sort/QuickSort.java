package Sort;


import java.sql.Time;

import static java.lang.Math.abs;

public class QuickSort {

    public static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void quicksort(int[] arr, int left, int right){
        int pleft= left;  //왼쪽 커서
        int pright= right;   //오른쪽 커서
        int pivot= arr[(pleft+pright)/2]; //피벗

        System.out.printf("arr[%d]~arr[%d] : {", left, right);
        for( int i=left; i<right;i++){
            System.out.printf("%d , ", arr[i]);
        }
        System.out.printf("%d}\n" , arr[right]);

        do {
            while (arr[pleft]<pivot) pleft++;
            while (arr[pright]>pivot) pright--;
            if(pleft<=pright)
                swap(arr,pleft++,pright--);
        }while (pleft<=pright);
        if (left < pright) quicksort(arr,left,pright);
        if (pleft < right) quicksort(arr,pleft, right);
    }

    public static void main(String[] args) {
        long First = System.currentTimeMillis();
        int[] arr={7,5,9,3,6,4,2,10,8,5,6,16,32,25,16,13,22,65,32,68,43,54,32,2,1,3,5,21,6,82,32,54,46,2,3,5532,31241};
        quicksort(arr, 0 ,arr.length-1 );
        long After= System.currentTimeMillis();
        System.out.println(After);
        long Timecount = (After-First)/1000;

        System.out.println(Timecount);


        for (int x: arr
             ) {

            System.out.print(x + " , ");

        }

    }
}
