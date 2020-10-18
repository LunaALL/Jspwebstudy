package Sort;

public class BubbleSortver1 {
    static int passnum= 1;

    static void swap(int [] arr, int x, int y){
        int t=arr[x];
        arr[x]=arr[y];
        arr[y]=t;
    }

    static void bubblesort(int[] arr, int leng){
        int change=0;
        int count=0;
        for(int i=0; i<leng;i++){
            if(passnum==leng){
                System.out.println("연산 종료. 비교 횟수:"+count+"회 교환 횟수:"+change+"회");
                break;
            }
            System.out.println("패스"+passnum+" 고정갯수:"+( passnum-1) );

            for(int j = 1 ; j<leng-i ; j++){
                if(arr[j-1] > arr[j]){
                    print(arr, j-1,j);
                    swap(arr,j-1,j);
                    count++;
                    change++;
                    continue;
                }
                count++;
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
        int[] arr1={8,4,5,21,1,5,2,11,21,6,9,7,2,8,14};
        bubblesort(arr1,arr1.length);

    }
}
