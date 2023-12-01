import java.util.HashSet;
import java.util.Set;

public class solllBruteForce {
    
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

  public static ListNode detectCycle(ListNode head){
      Set<ListNode> st = new HashSet<>();
      while(head != null){
          if(st.contains(head)) return head;
          st.add(head);
          head = head.next;
      }
      return null;
  }

  public static void main(String[] args) {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2, a);
    ListNode c = new ListNode(3, b);
    ListNode d = new ListNode(4, c);
    ListNode e = new ListNode(5, d);
    ListNode f = new ListNode(6, e);
    a.next = d;

    ListNode start = detectCycle(f);
    if(start == null) System.out.println("No Cycle");
    else {
        ListNode temp = f;
        int pos = 0;
        while(temp != start){
            pos++;
            temp = temp.next;
        }
    System.out.println("Tails Connects at Position: " + pos);
    }
  }

}
