
class DNode{
    int data; DNode prev,next;
    DNode(int d){data=d;}
}
public class Q10_RemoveDuplicatesDLL {
    static void remove(DNode head){
        for(DNode i=head;i!=null;i=i.next){
            for(DNode j=i.next;j!=null;){
                if(i.data==j.data){
                    j.prev.next=j.next;
                    if(j.next!=null) j.next.prev=j.prev;
                }
                j=j.next;
            }
        }
    }
}
