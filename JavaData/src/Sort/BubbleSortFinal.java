package Sort;

public class BubbleSortFinal {
    static void bubble(int [] arr){
        bubble(arr,arr.length);
    }
    static void bubble(int [] arr, int last){
        if(last>0){
            for(int i=1; i<last;i++){
                if(arr[i-1]<arr[i]){
                    swap(arr,i-1,i);
                }
            }
            bubble(arr,last-1);
        }

    }

    static void swap(int [] arr, int x, int y){
        int t=arr[x];
        arr[x]=arr[y];
        arr[y]=t;
    }

    public static void main(String[] args) {
        int[] arr = {6,9,5,1,4,3,2};
        bubble(arr);

        for (int x: arr
             ) {
            System.out.println(x);

        }
    }



}
