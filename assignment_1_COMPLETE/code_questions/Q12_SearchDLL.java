
class DNode12{
    int data; DNode12 prev,next;
    DNode12(int d){data=d;}
}
public class Q12_SearchDLL {
    static boolean search(DNode12 head,int x){
        while(head!=null){
            if(head.data==x) return true;
            head=head.next;
        }
        return false;
    }
}
