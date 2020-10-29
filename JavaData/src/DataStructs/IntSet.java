package DataStructs;
//배열로 집합 만들기

public class IntSet {
    private int max;
    private int num; // 넣은 갯수 .
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

    //자신의 집합을 매개변수로 들어온 s에 복사함.
    public void copyTo(IntSet s){
        int n= (s.max < num) ? s.max : num; //
        for(int i=0; i<n; i++){
            s.set[i] = set[i];
        }
        s.num=n;
    }

    //매개로 들어온 s 의 집합을 인스턴스 변수에 넣음.
    public void copyFrom(IntSet s){
        int n= (max<s.num) ? max : s.num;
        for(int i=0; i<n; i++){
            set[i]=s.set[i];
        }
        num=n;

    }

    public boolean equalTo(IntSet s){
        if(num !=s.num)
            return false;

        for(int i= 0; i< num; i++){
            int j=0;
            for( ; j< s.num ; j++){
                if(set[i] == s.set[j])
                    break;

            }

            if(j==s.num)
                return false;
        }
     return true;
    }

}
