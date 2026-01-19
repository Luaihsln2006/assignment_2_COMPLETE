
class Node{
    int data; Node next;
    Node(int d){data=d;}
}
public class Q5_ConcatLinkedList {
    static Node concat(Node a, Node b){
        if(a==null) return b;
        Node t=a;
        while(t.next!=null) t=t.next;
        t.next=b;
        return a;
    }
}
