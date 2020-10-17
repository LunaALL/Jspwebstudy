package Sort;

public class BubbleSortver1 {
    static void swap(int [] arr, int x, int y){
        int t=arr[x];
        arr[x]=arr[y];
        arr[y]=t;
    }

    static void bubblesort(int[] arr, int leng){
        for(int i=0; i<leng-1;i++){
            for(int j = leng-1 ; j>i ; j--){
                if(arr[j - 1] > arr[j]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1={1,5,3,10,2,4};
        bubblesort(arr1,arr1.length);

        for (int x:arr1
             ) {
            System.out.println(x);

        }
    }
}
