package Search;

public class bmMatch {
    static int bmMatch(String txt, String pat){
        int pt; //txt커서
        int pp; //pat커서
        int txtLen = txt.length(); //txt의 문자 갯수
        int patLen = pat.length(); //pat의 문자 개수
        int [] skip= new int[Character.MAX_VALUE+1];   //건너뛰기표, char 최댓값을 기준으로 배열 생성.

        for(pt= 0; pt <= Character.MAX_VALUE; pt++){
            skip[pt]=patLen;
        }
        for (pt=0; pt< patLen -1 ; pt++){
            skip[pat.charAt(pt)] = patLen - pt- 1;
        }
        System.out.println("건너띄기표 출력");
        for (int x: skip
             ) {
            if (x==pat.length()){
                //찾을 패턴에 존재할 수 있는 모든 문자의 옮길 크기를 계산하고 저장하기 때문에 중복이 많아 필요없는 부분은 제외함.
                continue;
            }
            System.out.print(x+",");

        }

        System.out.println("");
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

        int idx=bmMatch(txt,match);
        System.out.println(txt +"  |||| match = "+match);
        System.out.println( idx<0 ? "해당하는 패턴을 찾을 수 없습니다." : "원본 텍스트"+idx+"번째에서 찾았습니다");


    }

}
