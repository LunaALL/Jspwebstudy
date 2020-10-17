package Sort;

public class BubbleSortver1 {
    static int passnum= 1;

    static void swap(int [] arr, int x, int y){
        int t=arr[x];
        arr[x]=arr[y];
        arr[y]=t;
    }

    static void bubblesort(int[] arr, int leng){
        for(int i=0; i<leng;i++){
            System.out.println("패스"+passnum);
            for(int j = 1 ; j<leng-i ; j++){
                if(arr[j-1] > arr[j]){
                    print(arr, j-1,j);
                    swap(arr,j-1,j);
                    continue;
                }
                print2(arr,j-1,j);
            }
            passnum++;
        }
    }

    static void print(int[] arr,int y, int y2){
        for(int i=0; i<arr.length;i++){
            if(i==y){
                System.out.print(arr[i] + "+");
                continue;
            }
            if(i==y2){
                System.out.print(arr[i]+" ");
                continue;
            }
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
    }

    static void print2(int[] arr,int y, int y2){
        for(int i=0; i<arr.length;i++){
            if(i==y){
                System.out.print(arr[i] + "-");
                continue;
            }
            if(i==y2){
                System.out.print(arr[i]+" ");
                continue;
            }
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {
        int[] arr1={6,4,3,7,1,9,8};
        bubblesort(arr1,arr1.length);

    }
}
