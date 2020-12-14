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
        return key.hashCode() % size;
    }

    private V search(K key){
        int hash = hashValue(key);
        Node<K,V> p = table[hash];

        while (p != null){
            if (p.getKey().equals(key))
                return p.getValue();
            p=p.next;
        }
        return null;
    }

    public int add(K key, V data){
       int hash = hashValue(key);
       Node<K,V> p = table[hash];

       while (p != null){
           if (p.getKey().equals(key))
               return 1;
           p=p.next;
       }
       Node<K,V> temp = new Node<K,V>(key,data,table[hash]);
       table[hash]=temp;
       return 0;
    }





}
