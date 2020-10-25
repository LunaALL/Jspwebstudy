package Sort;

public class HeapSort {

    static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void toHeap(int[] arr, int left, int right){
        int temp= arr[left]; //루트
        int child ; //큰값을 가진 노드
        int parent; //부모

        for(parent =left; parent <(right +1) /2 ; parent = child){
            int cl=parent*2 +1;
            int cr=cl+1;
            child= (cr <= right && arr[cr] > arr[cl]) ? cr : cl;
            if(temp >= arr[child])
                break;
            arr[parent] = arr[child];
        }
        arr[parent]= temp;

    }


}
