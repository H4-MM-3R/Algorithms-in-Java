
public class kszrll {
    
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

    public static ListNode reverseKNodes(ListNode head, int k){
        ListNode temp = head;
        if(head == null || head.next == null) return head;

        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr;
        ListNode nxt;

        while(len >= k){
            curr = prev.next;
            nxt = curr.next;
            for (int i = 1; i <k ; i++) {
                curr.next = nxt.next;
                nxt.next = prev.next;
                prev.next = nxt;
                nxt = curr.next;
            }
            prev = curr;
            len -= k;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
      ListNode a = new ListNode(8);
      ListNode b = new ListNode(7, a);
      ListNode c = new ListNode(6, b);
      ListNode d = new ListNode(5, c);
      ListNode e = new ListNode(4, d);
      ListNode f = new ListNode(3, e);
      ListNode g = new ListNode(2, f);
      ListNode h = new ListNode(1, g);

        System.out.print("Original List is: ");
        printLL(h);
        ListNode newH = reverseKNodes(h, 3);
        System.out.println();
        System.out.print("List after reversing is: ");
        printLL(newH);
    }
    
    
}








