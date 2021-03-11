package Quiz;

public class 최소비용계단 {
    //최소비용으로 계단오륵
    /*
    계단에서 i번째 계단으로 올라가려면 양수값을 가지는 cost[i]
    올라가려면 값을 치뤄야함.
    1칸이나 2칸 갈수있음.
    당신은 계단 끝까지가는데 최대한 싸게 가는법을 찾아야함.
    0or1에서 시작가능
    input cost = [10,15,20]
    output 15

    input cost = [1, 100, 1,1,1, 100, 1, 1, 100, 1]
    두번째 계단은 100불
    output 6

     */

    static int minCostClimbingStatirs(int[] cost){
        int case1= 0, case2=0, current;
        for(int i= cost.length-1 ; i>=0; --i){
            System.out.println("i ="+i);
            System.out.println("------------");
            System.out.println("case1 = "+case1 +"| case2 = "+case2);

            current = cost[i] + Math.min(case1,case2);
            System.out.println("current1 = "+current + " case2 ="+case2);
            case2=case1;
            System.out.println("case1 = "+case1 +"| case2 = "+case2);
            case1=current;
            System.out.println("넣은다음 case1 = "+case1 +"| case2 = "+case2);
            System.out.println("-----------");
        }
         return Math.min(case1, case2);
    }

    public static void main(String[] args) {
        int[] cost={1,100,1,1,1,100,1,1,100,1};
        int[] cost2={10,15,20};
        int[] cost3={1,2,3,4,5,6,7};
        int result=minCostClimbingStatirs(cost3);
        System.out.println(result);

    }


}
