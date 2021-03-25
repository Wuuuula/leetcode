import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class leetcode_0082 {

    /**
     * 82. 删除排序链表中的重复元素 II
     *
     * 存在一个按升序排列的链表，给你这个链表的头节点 head ，
     * 请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
     *
     * 返回同样按升序排列的结果链表。
     */
    public ListNode deleteDuplicates(ListNode head) {
        // 第一位为数值，第二位为数值出现次数
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        ListNode temp = new ListNode();
        temp = head;
        while(temp != null){
            if (!hashMap.containsKey(temp.val)){
                hashMap.put(temp.val,1);
            }else{
                hashMap.put(temp.val,hashMap.get(temp.val)+1);
            }
            temp = temp.next;
        }
        // 测试
        Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();
        System.out.println("entries:" + entries);
        temp = head;
        ListNode listNode = temp;
        while(temp.next != null){
            ListNode node = listNode;
            System.out.println("测试：" + temp.val + "========" + temp.next);
            if (hashMap.get(temp.val) > 1){
                temp = temp.next.next;
            }else{
                temp = temp.next;
            }
            listNode.next = temp;
            node = listNode.next;
        }
        return listNode;
    }
}


