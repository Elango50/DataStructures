//slightly improved code without using collection framework

public class TestClass {

    private static Node last;
    private static Node first;

    public static void main(String[] args) {

        //Inserting
        for(int i=0;i<5;i++){
            Node.insert(i+5);
        }
        Node.printList();

        //Deleting
        Node.deletefromFirst();
        Node.printList();
    }


    protected  static class Node {
        private int data;
        private Node nextlink;

        public Node(int d1) {
            this.data = d1;
        }

        public static void insert(int d1) {
            Node a = new Node(d1);
            a.nextlink = null;
            if (first != null) {
                last.nextlink = a;
                last = a;
            } else {
                first = a;
                last = a;
            }
            System.out.println("Inserted -:"+d1);
        }

        public static void deletefromFirst() {
            if(null!=first)
            {
                System.out.println("Deleting -:"+first.data);
                first = first.nextlink;
            }
            else{
                System.out.println("No elements in Linked List");
            }
        }

        public static void printList() {
            System.out.println("Elements in the list are");
            System.out.println("-------------------------");
            Node temp = first;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.nextlink;
            }
        }
    }
}