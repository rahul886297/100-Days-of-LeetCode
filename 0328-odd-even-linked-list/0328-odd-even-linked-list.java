class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return head ;
        }
        ListNode oddHead = head ;
        ListNode evenHead = head.next ;
        ListNode evenStart = evenHead;

        while(evenHead!=null && evenHead.next!=null){
            oddHead.next = oddHead.next.next;
            evenHead.next = evenHead.next.next;

            oddHead = oddHead.next;
            evenHead = evenHead.next;
        }

        oddHead.next = evenStart;

        return head ;
    }
}