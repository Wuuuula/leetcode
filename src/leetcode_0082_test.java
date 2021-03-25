import org.junit.Test;

public class leetcode_0082_test {


    @Test
    public void leetcode_0082_test(){
        ListNode listNode4 = new ListNode(4,null);
        ListNode listNode3 = new ListNode(3,listNode4);
        ListNode listNode2 = new ListNode(2,listNode3);
        ListNode listNode1 = new ListNode(1,listNode2);
        ListNode head = listNode1;
        leetcode_0082 leetcode_0082 = new leetcode_0082();
        ListNode node = leetcode_0082.deleteDuplicates(head);
        ListNode temp = node;
        while(temp != null){
            System.out.println(temp.val + "=========" + temp.next);
            temp = temp.next;
        }
    }

}
