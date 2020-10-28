package DataStructs;
//배열로 집합 만들기

public class IntSet {
    private int max;
    private int num;
    private int[] set;

    public void Intset(int capacity){
        num=0;
        max=capacity;
        try{
            set=new int[max];
        }
        catch (OutOfMemoryError e){
            //배열 생성 실패
            max=0;
        }
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return num;
    }

}
