package Sort;

import java.util.Stack;

public class notReculQuicksort {

    public static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


    static void QuickSort(int []arr, int left, int right){
        Stack<Integer> lst =new Stack<Integer>();
        Stack<Integer> rst =new Stack<Integer>();

        lst.push(left);
        rst.push(right);

        while(lst.isEmpty() != true){
            int pleft = left =lst.pop();
            int pright= right = rst.pop();
            int x = arr[(left+right) /2 ];

            do{
                while( arr[pleft] < x) pleft++;
                while (arr[pr] > x) pr--;
                if(pleft<=pr)
                    swap(arr,pleft++, pr--);
            }while(pleft<=pr);


        }


    }

    public static void main(String[] args) {

    }
}
