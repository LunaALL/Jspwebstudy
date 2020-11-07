package Search;

public class kmpsearch {

    static int kmpMatch(String txt, String pat){
        int pt=1;  //txt 커서
        int pp=0;  //pat커서 찾는 패턴
        int[] skip = new int[pat.length()+1];

        //건너 뛰기 표

        System.out.println(txt);
        skip[pt]=0;
        while(pt != pat.length()){
            if(pat.charAt(pt) == pat.charAt(pp)) {
                skip[++pt] = ++pp;
            }
            else if (pp == 0){
                skip[++pt] = pp;
            }
            else{
                pp=skip[pp];
            }

        }


        System.out.println("건너뛰기표");
        for (int x: skip
             ) {
            System.out.print(+x+"|");
        }
        System.out.println(" ");

        pt=pp=0;
        while(pt != txt.length() && pp != pat.length()){
            if(txt.charAt(pt) == pat.charAt(pp)){
                pt++;
                pp++;
            } else if (pp==0){
                pt++;
            }
            else
                pp=skip[pp];
        }

        if (pp==pat.length())
            return pt - pp;
        return -1;
    }

    public static void main(String[] args) {
        String txt="ZABCABXACCADEF";
        String match="ABCABD";

        int idx=kmpMatch(txt,match);
        System.out.println( (idx<0 )? "찾지 못하였습니다.": idx+"칸에서 발견!!");
    }
}
