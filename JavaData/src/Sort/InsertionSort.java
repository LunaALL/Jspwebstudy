package Sort;

public class InsertionSort {

    static void insertionSort(int [] arr, int n){
        for(int i= 1 ; i<n ; i++){
            System.out.println("회차 "+i+"회" );
            int j;
            int temp=arr[i];

            for(j = i; j>0 && arr[j-1] > temp; j--){
                System.out.println("arr[j-1]= "+arr[j-1] + " temp"+temp);
                arr[j]= arr[j-1];
            }
            System.out.printf("%d번째 배열에", j);
            System.out.printf(" %d값을 넣습니다 \n",temp);
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
