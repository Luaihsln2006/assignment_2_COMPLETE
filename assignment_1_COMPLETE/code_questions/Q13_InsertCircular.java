
class CNode{
    int data; CNode next;
    CNode(int d){data=d;}
}
public class Q13_InsertCircular {
    static CNode insert(CNode head,int pos,int val){
        CNode n=new CNode(val);
        if(pos==0){
            n.next=head.next;
            head.next=n;
        }
        return head;
    }
}
