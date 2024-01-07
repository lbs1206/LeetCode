/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head= new ListNode(0);
        ListNode last = head;
        int num = 0;
        
        while(l1 != null || l2 != null){
            if (l1 != null) {
                num += l1.val;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                num += l2.val;
                l2 = l2.next;
            }
            
            last.next = new ListNode(num % 10);
            num /= 10;
            
            last = last.next;
        }
        
        if(num == 1){
            last.next = new ListNode(1);
        }
        
        return head.next;
    }
    
    private String longToString(ListNode ln) {
        String result = "";
              
        while(ln.next != null){
            result = Long.toString(ln.val) + result;
            ln = ln.next;
        }
        
        return Long.toString(ln.val) + result;
    }
    
    private ListNode longToListNode(long num) {
        
        char[] array = Long.toString(num).toCharArray();
        
        ListNode head = new ListNode(0);
        ListNode last = head;
        ListNode temp;
        for(int i = array.length - 1; i >= 0; i --){
            temp = new ListNode(Character.getNumericValue(array[i]));
            last.next = temp;
            last = last.next;
        }
                                
        return head.next;
        
    }
}