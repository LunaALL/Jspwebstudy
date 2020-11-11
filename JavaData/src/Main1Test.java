import DataStructs.LinkedList;

public class Main1Test {
    public static void main(String[] args) {
        LinkedList<Integer> L1= new LinkedList<>();
        L1.addFirst(10);
        L1.addFirst(20);
        L1.addFirst(30);

        L1.printCurrentNode();
        L1.removeFirst();
        L1.printCurrentNode();

    }
}
