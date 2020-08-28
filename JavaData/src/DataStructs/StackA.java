package DataStructs;

public class StackA {
    class Node{
        Node next;
        int item;
        public Node(int n){
            item=n;
        }
    }

    private Node top;
    public static void main(String[] args) {
        StackA st= new StackA();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.pop());
    }

    public void push(int n){
        Node n1 = new Node(n);
        n1.next=top;
        top=n1;
    }

    public int pop(){
        int n=top.item;
        top=top.next;
        return n;
    }
}
