
public class Q15_SearchCircular {
    static boolean search(CNode head,int x){
        CNode t=head;
        do{
            if(t.data==x) return true;
            t=t.next;
        }while(t!=head);
        return false;
    }
}
