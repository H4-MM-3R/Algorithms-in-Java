import java.util.ArrayList;
import java.util.List;

public class pllBruteForce {
 public static class ListNode{
        private int val;
        private ListNode next;
        public ListNode() {
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void printLL(ListNode head){
        while(head != null){
            System.out.print(head.val + ", ");
            head = head.next;
        }
    }   

    private static boolean isPalindrome(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        while(head != null){
            arr.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < arr.size() / 2; i++) {
            if(arr.get(i) != arr.get(arr.size() - i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2,a);
        ListNode c = new ListNode(3,b);
        ListNode d = new ListNode(4,c);
        ListNode e = new ListNode(4,d);
        ListNode f = new ListNode(3,e);
        ListNode g = new ListNode(2,f);
        ListNode h = new ListNode(1,g);

        System.out.println(isPalindrome(h) ? "It is a Palindrome" : "It is not a Palindrome");
    }


}
