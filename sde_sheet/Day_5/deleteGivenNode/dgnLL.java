public class dgnLL {
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

  static void printLL(ListNode head) {
    while (head != null) {
      System.out.print(head.val + ", ");
      head = head.next;
    }
  }

  public static void deleteNode(ListNode head, int target) {
    while (head.val != target) {
      head = head.next;
    }

    head.val = head.next.val;
    head.next = head.next.next;
  }

  public static void main(String[] args) {
    ListNode a = new ListNode(5);
    ListNode b = new ListNode(4, a);
    ListNode c = new ListNode(3, b);
    ListNode d = new ListNode(2, c);
    ListNode e = new ListNode(1, d);

    int target = 3;
    System.out.print("Original List is: ");
    printLL(e);
    System.out.println();
    deleteNode(e, target);
    System.out.print("List after Deleting target is ");
    printLL(e);
  }
}
