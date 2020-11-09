package DataStructs;

import java.util.Comparator;

public class LinkedList <E> {

    class Node<E> {
        private E data;
        private Node<E> next;

        Node(E data , Node<E> next){
            this.data = data;
            this.next = next;
        }
    }
    public LinkedList(){
        head= crnt =null;
    }

    private Node<E> head;
    private Node<E> crnt;

    // 노드 검색
    public E search(E obj, Comparator<? super E> c) {
        Node<E> ptr = head;							// 현재 스캔중인  노드

        while (ptr != null) {
            if (c.compare(obj, ptr.data) == 0) {	// 검색 성공
                crnt = ptr;
                return ptr.data;
            }
            ptr = ptr.next;							// 다음 노드를 선택
        }
        return null;								// 검색 실패
    }


    // 머리에 노드 삽입
    public void addFirst(E obj) {
        Node<E> ptr = head;							// 삽입 전의 머리 노드
        head = crnt = new Node<E>(obj, ptr);
    }

    // 꼬리에 노드 삽입
    public void addLast(E obj) {
        if (head == null)							// 리스트가 비어 있으면
            addFirst(obj);							// 머리에 삽입
        else {
            Node<E> ptr = head;
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = crnt = new Node<E>(obj, null);
        }
    }



}
