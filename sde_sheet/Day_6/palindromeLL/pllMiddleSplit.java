public class pllMiddleSplit {
  public static class ListNode {
    private int val;
    private ListNode next;

    public ListNode() {}

    public ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    public ListNode(int val) {
      this.val = val;
    }
  }

  public static void printLL(ListNode head) {
    while (head != null) {
      System.out.print(head.val + ", ");
      head = head.next;
    }
  }

  private static boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) return true;

    ListNode slow = head;
    ListNode fast = head;

    // Finding Middle Element
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    slow.next = reverse(slow.next);
    slow = slow.next;
    ListNode dummy = head;

    while (slow != null) {
      if (dummy.val != slow.val) return false;
      dummy = dummy.next;
      slow = slow.next;
    }
    return true;
  }

  private static ListNode reverse(ListNode ptr) {
    ListNode prev = null;
    ListNode nxt = null;
    while (ptr != null) {
      nxt = ptr.next;
      ptr.next = prev;
      prev = ptr;
      ptr = nxt;
    }
    return prev;
  }

  public static void main(String[] args) {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2, a);
    ListNode c = new ListNode(3, b);
    ListNode d = new ListNode(4, c);
    ListNode e = new ListNode(4, d);
    ListNode f = new ListNode(3, e);
    ListNode g = new ListNode(2, f);
    ListNode h = new ListNode(1, g);

    System.out.println(isPalindrome(h) ? "It is a Palindrome" : "It is not a Palindrome");
  }
}
