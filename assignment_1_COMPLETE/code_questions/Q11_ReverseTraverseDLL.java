
class DNode11{
    int data; DNode11 prev,next;
    DNode11(int d){data=d;}
}
public class Q11_ReverseTraverseDLL {
    static void printReverse(DNode11 head){
        while(head.next!=null) head=head.next;
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.prev;
        }
    }
}
