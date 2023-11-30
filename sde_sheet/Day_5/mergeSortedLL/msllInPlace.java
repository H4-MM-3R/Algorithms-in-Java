public class msllInPlace {
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

  public static ListNode mergeLLs(ListNode l1, ListNode l2) {
    if (l1 == null || l2 == null) {
      return l1 == null ? l2 : l1;
    }

    ListNode dummy = new ListNode(1);
    ListNode mergeHead = dummy;
    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        dummy.next = l1;
        dummy = l1;
        l1 = l1.next;
      } else {
        dummy.next = l2;
        dummy = l2;
        l2 = l2.next;
      }
    }

    if (l1 == null) {
      dummy.next = l2;
    } else if (l2 == null) {
      dummy.next = l1;
    }
    return mergeHead.next;
  }

  public static void main(String[] args) {
    ListNode a = new ListNode(10);
    ListNode b = new ListNode(9, a);
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
    System.out.println("Merged List is ");
    printLL(mergeLLs(f, j));
  }
}
