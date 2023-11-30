public class rllRecursive {

  public static class ListNode {
    private int val;
    private ListNode next;

    ListNode() {
      val = 0;
      next = null;
    }

    ListNode(int val) {
      this.val = val;
      next = null;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  static ListNode reverseLL(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode node = reverseLL(head.next);
    head.next.next = head;
    head.next = null;
    return node;
  }

  static void printLL(ListNode head) {
    while (head != null) {
      System.out.println("Curr Node" + head.val);
      head = head.next;
    }
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

    System.out.println("Original LL is ");
    System.out.println();
    printLL(j);
    System.out.println();
    System.out.println("Reversed LL is ");
    System.out.println();
    printLL(reverseLL(j));
  }
}
