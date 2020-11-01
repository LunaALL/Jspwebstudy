package DataStructs;

import java.util.Scanner;

public class BruteForcematch {

    static int bfMatch(String txt, String pat){
        int pt=0; //txt커서
        int pp=0; //찾는 문자열용 커서

        while(pt !=txt.length() && pp!= pat.length()){
            if(txt.charAt(pt)==pat.charAt(pp)){
                pt++;
                pp++;
                //찾아보고 아니면 커서를 옮겨 매치만큼 또 검사~
            } else{
                pt = pt-pp+1;
                pp=0;
            }
        }
        if(pp == pat.length())
            return pt-pp;
        return -1;
    }

    public static void main(String[] args) {
        Scanner std= new Scanner(System.in);
        System.out.println("텍스트 입력 :");
        String s1= std.nextLine();
        System.out.println("메모리 스트링 : " + s1);

        System.out.println("찾을 텍스트 :");
        String s2= std.nextLine();

        int idx= bfMatch(s1,s2);
        if(idx==-1){
            System.out.println("텍스트를 찾을수 없습니다.");
            }
        else{
            int len=0;
            for(int i=0; i<idx; i++){
                len += s1.substring()
            }
        }
    }
}
