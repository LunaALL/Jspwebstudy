package DataStructs;

import java.util.Comparator;

//일반화 클래스. 타입 여러가지를 지정 가능.
public class BinaryTree<K,V> {
    static class Node<K,V>{
        private K key;
        private V data;
        private Node<K,V> left;
        private Node<K,V>  right;

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

        void DataPrint(){
            System.out.println(data);
        }
    }

    private Node<K,V> root;
    private Comparator<? super K> comparator =null;

    public BinaryTree(){
        root= null;
    }

    public BinaryTree(Comparator<? super K> c) {
        this();
        comparator=c;
    }

    private int com(K key1, K key2) {
        return (comparator == null) ? ((Comparable<K>) key1).compareTo(key2) : comparator.compare(key1,key2);

    }

    }

