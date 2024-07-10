package day2;

  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
/**
 * Leetcode 61
 * https://leetcode.com/problems/rotate-list/
 */
public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;

        ListNode t = head;
        int sz = 1;

        while(t.next != null) {
            t = t.next;
            sz++;
        }
        k %= sz;

        int diff = sz - k;
        ListNode br = head;
        for(int i = 1; i < diff; i++) {
            br = br.next;
        }
        ListNode nRet = null;
        if(br != null && br.next != null) {
            nRet = br.next;
            br.next = null;
        }
        t.next = head;

        return nRet;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        rotateRight(head, 2);
    }
}
