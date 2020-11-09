package DataStructs;

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

}
