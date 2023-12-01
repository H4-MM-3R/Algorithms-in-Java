public class fll {
  public static class ListNode {
    private int val;
    private ListNode next;
    private ListNode bottom;

    public ListNode() {}

    public ListNode(int val) {
      this.val = val;
    }

    public ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    public ListNode(int val, ListNode next, ListNode bottom) {
      this.val = val;
      this.next = next;
      this.bottom = bottom;
    }
  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
      ListNode temp = new ListNode(0);
      ListNode ans = temp;

      while(l1 != null && l2 != null){
          if(l1.val < l2.val){
              temp.bottom = l1;
              temp = temp.bottom;
              l1 = l1.bottom;
          } else {
              temp.bottom = l2;
              temp = temp.bottom;
              l2 = l2.bottom;
          }
      }

      if(l1 != null) temp.bottom = l1;
      else temp.bottom = l2;
      return ans.bottom;
  }

  public static void printLL(ListNode head) {
    while (head != null) {
      System.out.print(head.val + ", ");
      head = head.next;
    }
  }

  public static ListNode flatten(ListNode root){
      if(root == null || root.next == null){
          return root;
      }
      root.next = flatten(root.next);

      root = mergeTwoLists(root, root.next);
      return root;
  }



  public static void main(String[] args) {
      ListNode a = new ListNode(28);
      ListNode b = new ListNode(50);
      ListNode c = new ListNode(30);
      ListNode d = new ListNode(22, null, b);
      ListNode e = new ListNode(19, a, d);
      ListNode f = new ListNode(10, e);
      ListNode g = new ListNode(8, null, c);
      ListNode h = new ListNode(7, null, g);
      ListNode i = new ListNode(5, f, h);

      
      printLL(flatten(i));
      System.out.println();

  }
}
