public class fmllSlowFast {
  public static class ListNode {
    int val;
    ListNode next;

    public ListNode() {}

    public ListNode(int val) {
      this.val = val;
    }

    public ListNode(int val, fmllSlowFast.ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public static void printLL(ListNode head) {
    while (head != null) {
      System.out.print(head.val + ", ");
      head = head.next;
    }
  }

  public static ListNode middleNode(ListNode node) {
    ListNode slow = node;
    ListNode fast = node;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public static void main(String[] args) {
    ListNode a = new ListNode(5);
    ListNode b = new ListNode(4, a);
    ListNode c = new ListNode(3, b);
    ListNode d = new ListNode(2, c);
    ListNode e = new ListNode(1, d);

    System.out.print("Original List is: ");
    printLL(e);
    System.out.println();
    System.out.println("Middle Node of List is " + middleNode(e).val);
  }
}
