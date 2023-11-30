public class fmllBruteForce {
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

  static ListNode middleNode(ListNode head) {
    int n = 0;
    ListNode temp = head;
    while (temp != null) {
      n++;
      temp = temp.next;
    }

    temp = head;

    for (int i = 0; i < n / 2; i++) {
      temp = temp.next;
    }

    return temp;
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
