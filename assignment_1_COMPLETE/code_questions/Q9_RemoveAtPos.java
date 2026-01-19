
class Node9{
    int data; Node9 next;
    Node9(int d){data=d;}
}
public class Q9_RemoveAtPos {
    static Node9 remove(Node9 head,int pos){
        if(pos==0) return head.next;
        Node9 t=head;
        for(int i=0;i<pos-1;i++) t=t.next;
        t.next=t.next.next;
        return head;
    }
}
