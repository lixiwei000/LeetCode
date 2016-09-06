package easy;

import javax.swing.*;

/**
 * @author NikoBelic
 * @create 16/9/6 01:05
 */
public class ReverseLinkedList
{
    public ListNode reverseList(ListNode head)
    {
        ListNode p = head;
        ListNode q = head.next;
        ListNode s = head;
        while(q != null)
        {
            s = q.next;
            q.next = p;
            p = q;
            q = s;
        }
        head.next = null;
        while(p.next != null)
        {
            System.out.print(p.val + "->");
            p = p.next;
        }
        return p;
    }
    public static void main(String[] args)
    {
        ReverseLinkedList t = new ReverseLinkedList();
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);


        t.reverseList(head);
    }
}
// p       q      s
// head -> p1 -> p2 -> p3
//               q
// head <- p1    p2 -> p3
// head <- p1 -> p
//
class ListNode
{
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}