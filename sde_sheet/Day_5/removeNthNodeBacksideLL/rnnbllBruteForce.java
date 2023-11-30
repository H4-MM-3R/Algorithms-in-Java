public class rnnbllBruteForce {
  public static class ListNode {
    int val;
    ListNode next;

    public ListNode() {}

    public ListNode(int val) {
      this.val = val;
    }

    public ListNode(int val, ListNode next) {
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

  public static ListNode removeNthFromBack(ListNode head, int n) {
    int len = 0;
    ListNode ptr = head;
    while (ptr.next != null) {
      len++;
      ptr = ptr.next;
    }

    // edge case for last element from last
    if (len >= n) {
      head = head.next;
      return head;
    }

    ptr = head;
    for (int i = 0; i < len - n; i++) {
      ptr = ptr.next;
    }

    ptr.next = ptr.next.next;
    return head;
  }

  public static void main(String[] args) {
    ListNode a = new ListNode(10);
    ListNode b = new ListNode(9, a);
    ListNode c = new ListNode(7, b);
    ListNode d = new ListNode(5, c);
    ListNode e = new ListNode(3, d);
    ListNode f = new ListNode(1, e);

    System.out.print("Original List is: ");
    printLL(f);
    System.out.println();
    System.out.print("List after removing is: ");
    printLL(removeNthFromBack(f, 5));
  }
}
