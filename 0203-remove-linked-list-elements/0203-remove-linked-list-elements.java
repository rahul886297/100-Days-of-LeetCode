class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head ;
        ListNode curr = dummy ;

        while(curr.next!=null){

            if(curr.next.val==val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}