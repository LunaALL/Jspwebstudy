package DataStructs;

public class ChainHasha <K,V> {

    class Node<K,V> {
        private K key; //키값
        private V data; //데이터
        private Node<K,V> next;  //다음 노드에 대한 참조

        public Node(K key, V data, Node<K, V> next) {
            this.key = key;
            this.data = data;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return data;
        }

        public int hashCode(){
            return key.hashCode();
        }

    }

    private int	size;						// 해시 테이블의 크기
    private Node<K,V>[] table;				// 기본 해시 테이블,

    // 생성자
    public ChainHasha(int capacity) {
        try {
            table = new Node[capacity];
            this.size = capacity;
        } catch (OutOfMemoryError e) {		// 테이블을 생성할 수 없음
            this.size = 0;
        }
    }

    // 해시값을 구함
    public int hashValue(Object key) {
        System.out.println("hashcode what= " + key.hashCode() );
        return key.hashCode() % size;
    }

    private V search(K key){
        int hash = hashValue(key);  //검색할 데이터의 해시 값
        Node<K,V> p = table[hash]; // 선택 노드

        while (p != null){
            if (p.getKey().equals(key))
                return p.getValue();  //검색 성공
            p=p.next;    //다음 노드를 가리키도록
        }
        return null;   //검색 실패니까 null 반환함
    }

    public int add(K key, V data){
       int hash = hashValue(key);  //추가할 데이터의 해시 값
       Node<K,V> p = table[hash];  //선택 노드

       while (p != null){
           if (p.getKey().equals(key))   //이 키값은 이미 등록되었으니 리턴 1
               return 1;
           p=p.next;   // 다음 노드를 가리키도록
       }
       Node<K,V> temp = new Node<K,V>(key,data,table[hash]);
       table[hash]=temp;   //해시 테이블안에 노드를 삽입함. temp 노드
       return 0;
    }

    public int remove(K key){
        int hash= hashValue(key);
        Node<K,V> p = table[hash];
        Node<K,V> pp = null;

        while (p != null){
            if(p.getKey().equals(key)){
                if (pp == null)
                    table[hash] = p.next;
                else
                    pp.next= p.next;
                return 0;
            }
            pp=p;
            p=p.next;
        }
        return 1;
    }

    public void dump() {
        for (int i=0; i < size; i++){
            Node<K,V> p =table[i];

        }
    }




}
