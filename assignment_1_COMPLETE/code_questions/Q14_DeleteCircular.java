
public class Q14_DeleteCircular {
    static CNode delete(CNode head,int pos){
        CNode t=head;
        for(int i=0;i<pos-1;i++) t=t.next;
        t.next=t.next.next;
        return head;
    }
}
