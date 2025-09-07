class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast!=null){
            slow = slow.next;
        }
        ListNode secondHalfHead = reverseList(slow);
        ListNode p1 = head;
        ListNode p2 = secondHalfHead;
        boolean palindrome = true;
        while(p2!=null){
            if(p1.val!=p2.val){
                palindrome = false;
                break;
            }
            p1=p1.next;
            p2=p2.next;
        }
        reverseList(secondHalfHead);
        return palindrome;
    }
    private ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nexttemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nexttemp;
        }
        return prev;
    }
}