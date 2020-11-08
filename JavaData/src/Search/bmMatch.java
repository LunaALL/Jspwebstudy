package Search;

public class bmMatch {
    static int bmMatch(String txt, String pat){
        int pt; //txt커서
        int pp; //pat커서
        int txtLen = txt.length(); //txt의 문자 갯수
        int patLen = pat.length(); //pat의 문자 개수
        int [] skip= new int[Character.MAX_VALUE+1];   //건너뛰기표

        for(pt= 0; pt <= Character.MAX_VALUE; pt++){
            skip[pt]=patLen;
        }
        for (pt=0; pt< patLen -1 ; pt++){
            skip[pat.charAt(pt)] = patLen - pt- 1;
        }
        while(pt<txtLen){
            pp=patLen-1;

            while (txt.charAt(pt) == pat.charAt(pp)){
                if(pp==0)
                    return pt;
                pp--;
                pt--;
            }
            pt += (skip[txt.charAt(pt)] > patLen -pp) ? skip[txt.charAt(pt)] : patLen-pp;
        }
        return -1;

    }

    public static void main(String[] args) {
        String txt= "ABFKEJGKDEFLDKAVLDS";
        String match= "EFLD";

        System.out.println(bmMatch(txt,match));
    }

}
