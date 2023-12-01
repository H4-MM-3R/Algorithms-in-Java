import java.util.HashSet;
import java.util.Set;

public class cdllTwoPointer {
    
 public static class ListNode{
        private int val;
        private ListNode next;
        public ListNode() {
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void printLL(ListNode head){
        while(head != null){
            System.out.print(head.val + ", ");
            head = head.next;
        }
    }   

    public static boolean hasCycle(ListNode head){
        Set<ListNode> st = new HashSet<>();
        while(head != null){
            if(st.contains(head)){
                return true;
            }
            st.add(head);
            head = head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2, a);
        ListNode c = new ListNode(3, b);
        ListNode d = new ListNode(4, c);
        ListNode e = new ListNode(5, d);
        ListNode f = new ListNode(6, e);
        ListNode g = new ListNode(7, f);
        ListNode h = new ListNode(8, g);
        ListNode i = new ListNode(9, h);
        ListNode j = new ListNode(10, i);
        a.next = f;

        System.out.println("has cycle = " + hasCycle(j));
    }
}
