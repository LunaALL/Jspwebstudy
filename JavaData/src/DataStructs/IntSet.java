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

    public int isSize() {
        return num;
    }

    public int indexOf(int key){
        for(int i=0; i<max ; i++){
            if(set[i]==key){
                return i;
            }
        }
        return -1;
    }

    //집합에 n이 있는지??
    public boolean isCollect(int n){
        return (indexOf(n) !=-1) ? true : false;
    }

    //집합에 a 추가
    public boolean add(int n){
        if(num>=max || isCollect(n) == true){
            return false;
        }else {
            set[num++]=n;
            return true;
        }
    }

    public boolean remove(int n){
        int idx;
        if(num <= 0 || ( idx=indexOf(n) ) == -1)
        {
            return false;
        } else{
            set[idx] = set[--num];
            return true;
        }
    }


}
