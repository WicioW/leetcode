package arraysandhashing;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode tmpNode = null;
        while (head != null) {
            if(tmpNode!= null){
                tmpNode = new ListNode(head.val, tmpNode);
            }else{
                tmpNode = new ListNode(head.val);
            }
            head = head.next;
        }
        return tmpNode;
    }

    public static void main(String[] args) {
        print(reverseList(new ListNode(1, new ListNode(2))));
        print(reverseList(new ListNode(1, new ListNode(2,new ListNode(3,new ListNode(4))))));
    }

    static void print(ListNode node){
        while(node != null){
            System.out.print(node.val);
            node = node.next;
        }
        System.out.println(" ");
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    
}
