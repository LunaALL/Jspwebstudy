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
    }


}
