package DataStructs;

public class BubbleS {

    public static void main(String[] args) {
        int[] arr= {1,5,8,4,2,4,33,10};
        BubbleSort(arr);
        for(int e : arr){
            System.out.println(e);
        }
    }

    public static void BubbleSort(int[] arr){
        for(int i=0; i< arr.length ; i++){
            for(int j=1 ; j<arr.length-i;j++){
                if(arr[j-1]> arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }



}
