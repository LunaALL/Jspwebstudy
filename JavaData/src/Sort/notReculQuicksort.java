package Sort;

import java.util.Stack;

public class notReculQuicksort {

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    static void QuickSort(int[] arr, int left, int right) {
        Stack<Integer> lst = new Stack<Integer>();
        Stack<Integer> rst = new Stack<Integer>();

        lst.push(left);
        rst.push(right);

        while (lst.isEmpty() != true) {
            int pleft = left = lst.pop();
            int pright = right = rst.pop();
            int x = arr[(left + right) / 2];

            do {
                while (arr[pleft] < x) pleft++;
                while (arr[pright] > x) pright--;
                if (pleft <= pright)
                    swap(arr, pleft++, pright--);
            } while (pleft <= pright);

            if (left < pright) {
                lst.push(left);
                rst.push(pright);
            }

            if (pleft < right) {
                lst.push(pleft);
                rst.push(right);
            }


        }


    }

    public static void main(String[] args) {

        int[] arr ={6,5,9,4,2,10,16,22,1};

        QuickSort(arr,0,arr.length-1);

        for (int x: arr
             ) {
            System.out.print(x+",");

        }

    }
}
