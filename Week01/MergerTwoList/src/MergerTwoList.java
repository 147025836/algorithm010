/**题目：合并两个有序链表
 * 递归解法
 */
public class MergerTwoList {
    public ListNode mergeTwoList(ListNode l1,ListNode l2){
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next=mergeTwoList(l1.next,l2);//递归调用
            return l1;
        }
        else {
            l2.next=mergeTwoList(l1,l2.next);
            return l2;
        }
    }
}
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) {
         this.val = val;
     }
     ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next; }
 }