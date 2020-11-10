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

    private Node<E> head; // 머리 노드
    private Node<E> crnt; // 선택 노드

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
    // 머리 노드 삭제
    public void removeFirst() {
        if (head != null)							// 리스트가 비어 있지 않으면
            head = crnt = head.next;
    }

    public void removeLast() {
        if (head != null) {
            if (head.next == null)					// 노드가 하나만 있으면
                removeFirst();						// 머리 노드를 삭제
            else {
                Node<E> ptr = head;					// 스캔 중인  노드
                Node<E> pre = head;					// 스캔 중인  노드의 앞쪽 노드

                while (ptr.next != null) {
                    pre = ptr;
                    ptr = ptr.next;
                }
                pre.next = null;					// pre는 삭제 후의 꼬리 노드
                crnt = pre;
            }
        }
    }



}
