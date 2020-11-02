package DataStructs;

import java.util.Scanner;

public class BruteForcematch {



    static int bfMatch(String txt, String pat){
        int pt=0; //txt커서
        int pp=0; //찾는 문자열용 커서

        while(pt !=txt.length() && pp!= pat.length()){
            System.out.println(pp + txt);
            if(txt.charAt(pt)==pat.charAt(pp)){
                if(pt>0){
                    for(int j=0; j<pt;j++){
                        System.out.printf(" ");
                    }
                }
                System.out.println("+");

                pt++;
                pp++;
                //찾아보고 아니면 커서를 옮겨 매치만큼 또 검사~
            } else{
                if(pt>0){
                    for(int j=0; j<pt;j++){
                        System.out.printf(" ");
                    }
                }
                System.out.println("|");
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
            //일치하는 문자 바로 앞까지의 길이를 구함
            int len=0;
            for(int i=0; i<idx; i++){
                System.out.println("sub스트링"+s1.substring(i,i+1).getBytes().length);
                len += s1.substring(i, i+1).getBytes().length;
            }
            len +=s2.length();
            System.out.println((idx+1) + "번째 문자부터 일치");
            System.out.println("원문 텍스트:" + s1);
            System.out.printf(String.format("패턴:%%%ds\n", len), s2);

        }


    }
}
