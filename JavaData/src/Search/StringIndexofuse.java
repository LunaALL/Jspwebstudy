package Search;

import java.util.Scanner;

public class StringIndexofuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("텍스트 :");
        String Plaintxt= sc.nextLine();

        System.out.println("찾을 텍스트:");
        String match = sc.nextLine();

        int idx1= Plaintxt.indexOf(match);
        int idx2= Plaintxt.lastIndexOf(match);  //끝자락 점검.

        if(idx1 == -1)
            System.out.println("텍스트 안에 패턴이 없습니다.");
        else{
            int len1=0;
            for(int i=0; i< idx1; i++){
                len1 += Plaintxt.substring(i,i+1).getBytes().length;
            }
            len1+=match.length();

            int len2=0;
            for(int i=0; i<idx2; i++){
                len2 += Plaintxt.substring(i, i+1).getBytes().length;
            }
            len2 += match.length();

            System.out.println("텍스트:"+Plaintxt);
            System.out.printf(String.format("패턴 : %%%ds\n",len1) , match);
            System.out.println("텍스트:"+Plaintxt);
            System.out.printf(String.format("패턴 : %%%ds\n",len2) , match);



        }
    }
}
