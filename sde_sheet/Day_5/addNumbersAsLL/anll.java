public class anll {
    public static class ListNode{
        private int val;
        private ListNode next;
        public ListNode() {
        }
        public ListNode(int val, anll.ListNode next) {
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

    public static ListNode addNumbersAsLL(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }

  public static void main(String[] args) {
    ListNode b = new ListNode(9);
    ListNode c = new ListNode(7, b);
    ListNode d = new ListNode(5, c);
    ListNode e = new ListNode(3, d);
    ListNode f = new ListNode(1, e);

    ListNode g = new ListNode(8);
    ListNode h = new ListNode(6, g);
    ListNode i = new ListNode(4, h);
    ListNode j = new ListNode(2, i);

    System.out.print("List-1 is: ");
    printLL(f);
    System.out.println();
    System.out.print("List-2 is: ");
    printLL(j);
    System.out.println();
    System.out.println("New number as List is ");
    printLL(addNumbersAsLL(f, j));
  }
}
