
public class Q16_SplitCircular {
    static void split(CNode head){
        CNode slow=head,fast=head;
        while(fast.next!=head && fast.next.next!=head){
            slow=slow.next;
            fast=fast.next.next;
        }
        CNode head2=slow.next;
        slow.next=head;
        fast.next=head2;
    }
}
