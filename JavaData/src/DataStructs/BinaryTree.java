package DataStructs;

import java.util.Comparator;

//일반화 클래스. 타입 여러가지를 지정 가능.
public class BinaryTree<K, V> {
    static class Node<K, V> {
        private K key;
        private V data;
        private Node<K, V> left;
        private Node<K, V> right;

        public Node(K key, V data, Node<K, V> left, Node<K, V> right) {
            this.key = key;
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public K getKey() {
            return key;
        }

        public V getData() {
            return data;
        }

        void DataPrint() {
            System.out.println(data);
        }
    }

    private Node<K, V> root;
    private Comparator<? super K> comparator = null;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(Comparator<? super K> c) {
        this();
        comparator = c;
    }

    private int comp(K key1, K key2) {
        return (comparator == null) ? ((Comparable<K>) key1).compareTo(key2) : comparator.compare(key1, key2);

    }

    public V search(K key) {
        Node<K, V> p = root;

        while (true) {
            if (p == null) {
                return null;
            }
            int cond = comp(key, p.getKey());
            if (cond == 0)
                return p.getData(); //검색 성공
            else if (cond < 0)
                p = p.left;
            else
                p = p.right;
        }
    }

    private void addNode(Node<K, V> node, K key, V data) {
        //key 삽입하는 노드의 키값
        //data 데이터
        int cond = comp(key, node.getKey());
        if (cond == 0)
            return;
        else if (cond < 0) {
            if (node.left == null) {
                node.left = new Node<K, V>(key, data, null, null);
            } else {
                addNode(node.left, key, data);
            }
        } else{
            if (node.right == null) {
                node.right = new Node<K, V>(key, data, null null);
            } else {
                addNode(node.right, key, data);
            }
        }

    }

    public void add(K key, V data){
        if(root == null)
            root = new Node<K,V>(key, data , null, null);
        else
            addNode(root, key, data);
    }

}

