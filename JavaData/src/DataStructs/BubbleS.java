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
        BubbleSort(arr,arr.length-1);
    }

    public static void BubbleSort(int[] arr,int length){
        if(length>0){
            for (int i=1; i<=length;i++){
                if(arr[i-1]>arr[i]){
                    swap(arr,i-1,i);
                }
            }
            BubbleSort(arr,length-1);
        }
    }

    public static void swap(int[] arr, int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
