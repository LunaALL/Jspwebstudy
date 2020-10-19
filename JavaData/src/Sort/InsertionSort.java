package Sort;

public class InsertionSort {

    static void insertionSort(int [] arr, int n){
        for(int i= 1 ; i<n ; i++){
            int j;
            int temp=arr[i];

            for(j = i; j>0 && arr[j-1] > temp; j--){
                arr[j]= arr[j-1];
            }
            System.out.println("j1= "+j +" temp"+temp);
            arr[j]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr={22,5,11,32,120,68,70};
        insertionSort(arr, arr.length);
        for (int x : arr
             ) {
            System.out.println(x);
        }
    }

}
