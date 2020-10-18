package Sort;

public class BubbleSortver2 {

    static void swap(int [] arr, int x, int y){
        int t=arr[x];
        arr[x]=arr[y];
        arr[y]=t;
    }

    static void bubblesort(int[] arr, int leng){
        int k=0;
        while(k<leng-1){
            int last=leng-1;
            for(int j=leng-1; j>k ;  j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                    last=j;
                }
            }
            k=last;
        }
    }

    public static void main(String[] args) {
        int[] arr= {5,8,1,2,7,4,6};
        bubblesort(arr,arr.length);

        for (int x:arr
             ) {
            System.out.println(x);

        }
    }

}
