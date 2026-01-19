
class Node7{
    int data; Node7 next;
    Node7(int d){data=d;}
}
public class Q7_SearchSingly {
    static int search(Node7 head,int x){
        int pos=0;
        while(head!=null){
            if(head.data==x) return pos;
            pos++; head=head.next;
        }
        return -1;
    }
}
