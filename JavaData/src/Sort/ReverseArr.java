package Sort;

public class ReverseArr {

    public static void reverse(int[] arr){

        for(int i=0; i < arr.length/2 ; i++){
            swap(arr, i, arr.length-i-1);
        }


    }

    public static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,2,3,4,10};
        reverse(arr);

        for(int i:arr){
            System.out.println(i);
        }

    }

}
