package Quiz;
//각 열에 1개의 퀸을 배치하는 조합을 재귀적으로 나열.
public class Queen8 {
    //각 행에 퀸을 배치했는지 체크
    static boolean[] flag_a= new boolean[8];
    static boolean[] flag_b= new boolean[15];
    static boolean[] flag_c= new boolean[15];  //대각선 방향으로 퀸을 배치했는지 체크하는 flagb,c
    static int[] pos = new int[8]; //각 열의 퀸 위치
    static int count=0;

    //각 열의 퀸의 위치를 출력.
    static void print() {
        //i가 곧 열.
        for (int i=0; i<8;i++){
            System.out.printf("%2d행",pos[i]);
        }
        count++;
        System.out.println(" ");
    }


    //i열에 퀸을 놓습니다.
    static void set(int i){
      for (int j=0; j<8;j++ ){
          if(flag_a[j] == false && flag_b[i+j] == false && flag_c[i-j+7]== false) {  //j행에 퀸을 배치하지 않았다면
              pos[i] = j; // 퀸을 j행에 배치.
              if (i == 7) //모든 열에 배치한 경우.
                  print();
              else {
                  flag_a[j] = flag_b[i+j] = flag_c[i-j+7]=  true;
                  set(i + 1);
                  flag_a[j] = flag_b[i+j] = flag_c[i-j+7]= false;
              }
          
          }
      }
    }

    public static void main(String[] args) {
        System.out.println(" 1열 2열 3열 4열 5열 6열 7열 8열");
        set(0); // 0열에 퀸 배치.
        System.out.println("8퀸 문제 수행 답안 "+ count);

    }

}
