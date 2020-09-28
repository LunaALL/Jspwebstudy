package Sort;

public class Cardinalnum {

    public static int cardconv(int n, char[] arr){
        String str="01";
        int i=0;

        do {
            arr[i++] = str.charAt(n % 2);
            n = n / 2;

        }while(n!=0);
        return i;
    }

    public static void main(String[] args) {
        char[] arr = new char[30];
        int n=cardconv(10, arr);

       for(int i=n; i>=0 ;i--){
           System.out.println(arr[i]);
       }

    }

}
