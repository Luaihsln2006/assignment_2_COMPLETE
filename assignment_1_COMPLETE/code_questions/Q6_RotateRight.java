
class Node6{
    int data; Node6 next;
    Node6(int d){data=d;}
}
public class Q6_RotateRight {
    static Node6 rotate(Node6 head,int k){
        if(head==null) return head;
        for(int i=0;i<k;i++){
            Node6 t=head;
            while(t.next.next!=null) t=t.next;
            Node6 last=t.next;
            t.next=null;
            last.next=head;
            head=last;
        }
        return head;
    }
}
