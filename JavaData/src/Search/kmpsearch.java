package Search;

public class kmpsearch {

    static int kmpMatch(String txt, String pat){
        int pt=1;  //txt 커서
        int pp=0;  //pat커서 찾는 패턴
        int[] skip = new int[pat.length()+1];

        //건너 뛰기 표


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
        String txt="ABCDEFABDEFBAQ";
        String match="ABDEF";

        int idx=kmpMatch(txt,match);

        System.out.println(idx);
    }
}
