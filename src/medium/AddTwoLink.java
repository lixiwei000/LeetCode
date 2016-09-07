package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Pack200;

/**
 * @author NikoBelic
 * @create 9/6/16 23:53
 */
public class AddTwoLink
{
    /**
     * My Answer
     * @Author NikoBelic
     * @Date 9/7/16 09:58
     */
    public ListNode addTwoNumbersV1(ListNode l1, ListNode l2)
    {
        ListNode head = l1;
        ListNode l1Pre = new ListNode(0);
        int flag = 0;
        while(l1 != null || l2 != null)
        {
            if (flag != 0)
            {
                l1.val += flag;
                flag = 0;
            }
            if (l1 != null && l2!= null)
            {
                l1.val += l2.val;
            }
            else if (l1 == null && l2 != null) //尾部
            {
                l1 = new ListNode(l2.val);
                l1Pre.next = l1;
            }
            if (l1.val / 10 > 0)
            {
                flag = 1;
                if (l1.next == null)
                {
                    l1.next = new ListNode(0);
                }
            }
            l1.val = l1.val % 10;
            l1Pre = l1;
            l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        while(head != null)
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode result = new ListNode(0);
        ListNode curr = result;
        int carry = 0;
        while (l1 != null || l2 != null)
        {
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            curr.next = new ListNode((a + b + carry) % 10);
            carry = (a + b + carry) / 10;
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
            curr = curr.next;
        }
        if ( carry > 0)
            curr.next = new ListNode(carry);
        result = result.next;
        while(result != null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
        return result.next;
    }
    public static void main(String[] args)
    {
        AddTwoLink test = new AddTwoLink();
        ListNode n1 = new ListNode(1);
        //ListNode n2 = new ListNode(6);
        //ListNode n3 = new ListNode(7);
        //n1.next = n2;
        //n2.next = n3;
        ListNode b1 = new ListNode(9);
        ListNode b2 = new ListNode(9);
        //ListNode b3 = new ListNode(5);
        b1.next = b2;
        //b2.next = b3;
        test.addTwoNumbers(n1,b1);
    }
}

class ListNode
{
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
