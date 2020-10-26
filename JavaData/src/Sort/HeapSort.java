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

    static void heapSort(int[] arr, int n){
        for (int i= (n-1)/2 ; i>=0 ; i--){  //arr[i]~arr[i-1]를 힙으로 만들기.
            toHeap(arr,i,n-1);
        }

        for(int i=n-1; i>0 ; i--){
            swap(arr , 0 , i);
            toHeap(arr,0,i-1);
        }
    }

    public static void main(String[] args) {
        int [] arr= {8,3,5,1,7,4,10,9,13,22};

        heapSort(arr, arr.length);

        for(int i=0; i<arr.length ; i++){
            System.out.println("힙정렬 완료!! ");
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }




}
