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
   //작을 땐 -1, 많으면 1 , 같으면 0
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
                node.right = new Node<K, V>(key, data, null, null);
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

    // 키 값이 key인 노드를 삭제
    public boolean remove(K key) {
        Node<K,V> p = root;								// 스캔 중인  노드
        Node<K,V> parent = null;						// 스캔 중인  노드의 부모 노드
        boolean isLeftChild = true;						// p는 parent의 왼쪽 자식 노드인가?

        while (true) {
            if (p == null)								// 더 이상 진행하지 않으면
                return false;							// 그 키 값은 없습니다.
            int cond = comp(key, p.getKey());			// key와 노드 p의 키 값을 비교
            if (cond == 0)								// 같으면
                break;									// 검색 성공
            else {
                parent = p;								// 가지로 내려가기 전에 부모를 설정
                if (cond < 0) {							// key 쪽이 작으면
                    isLeftChild = true;					// 왼쪽 자식으로 내려감
                    p = p.left;							// 왼쪽 서브트리에서 검색
                } else {								// key 쪽이 크면
                    isLeftChild = false;				// 오른쪽 자식으로 내려감
                    p = p.right;						// 오른쪽 서브 트리에서 검색
                }
            }
        }

        if (p.left == null) {							// p에는 왼쪽 자식이 없음
            if (p == root)
                root = p.right;
            else if (isLeftChild)
                parent.left  = p.right;					// 부모의 왼쪽 포인터가 오른쪽 자식을 가리킴
            else
                parent.right = p.right;					// 부모의 오른쪽 포인터가 오른쪽 자식을 가리킴
        } else if (p.right == null) {					// p에는오른쪽 자식이 없음
            if (p == root)
                root = p.left;
            else if (isLeftChild)
                parent.left  = p.left;					// 부모의 왼쪽 포인터가 왼쪽 자식을 가리킴
            else
                parent.right = p.left;					// 부모의 오른쪽 포인터가 왼쪽 자식을 가리킴
        } else {
            parent = p;
            Node<K,V> left = p.left;					// 서브 트리 가운데 가장 큰 노드
            isLeftChild = true;
            while (left.right != null) {				// 가장 큰 노드 left를 검색
                parent = left;
                left = left.right;
                isLeftChild = false;
            }
            p.key  = left.key;							// left의 키 값을 p로 옮김
            p.data = left.data;							// left의 데이터를  p로 옮김
            if (isLeftChild)
                parent.left  = left.left;				// left를 삭제
            else
                parent.right = left.left;				// left를 삭제
        }
        return true;
    }




}

