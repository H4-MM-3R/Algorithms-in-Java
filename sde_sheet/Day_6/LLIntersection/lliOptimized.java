public class lliOptimized {
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

  public static ListNode intersection(ListNode l1, ListNode l2) {
      ListNode node1 = l1;
      ListNode node2 = l2;

      while(node1 != node2){
          node1 = node1 == null ? l2 : node1.next;
          node2 = node2 == null ? l1 : node2.next;
      }
      return node1;
  }

  public static void main(String[] args) {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2, a);
    ListNode c = new ListNode(3, b);
    ListNode d = new ListNode(4, c);
    ListNode e = new ListNode(5, d);
    ListNode f = new ListNode(6, e);

    ListNode g = new ListNode(7, e);
    ListNode h = new ListNode(8, g);
    ListNode i = new ListNode(9, h);
    ListNode j = new ListNode(10, i);
    ListNode k = new ListNode(11, j);
    ListNode l = new ListNode(12, k);
    System.out.print("Head 1 view of list: ");
    printLL(f);
    System.out.println();
    System.out.print("Head 2 view of list: ");
    printLL(l);
    System.out.println();
    System.out.println(intersection(f, l).val);
  }
}
