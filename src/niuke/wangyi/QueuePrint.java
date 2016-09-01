package niuke.wangyi;

import java.util.Deque;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

/**
 while(!Q.empty())              //队列不空，执行循环

 {

 int x=Q.front();            //取出当前队头的值x

 Q.pop();                 //弹出当前队头

 Q.push(x);               //把x放入队尾

 x = Q.front();              //取出这时候队头的值

 printf("%d\n",x);          //输出x

 Q.pop();                 //弹出这时候的队头

 }
 n = 3
 result : 1 2 3
 3 1 2
 2 3 1


 做取出队头的值操作的时候，并不弹出当前队头。
 小明同学发现，这段程序恰好按顺序输出了1,2,3,...,n。现在小明想让你构造出原始的队列，你能做到吗？
 [注：原题样例第三行5有错，应该为3，以下已修正]

 输入例子:
 4
 1
 2
 3
 10

 输出例子:
 1
 2 1
 2 1 3
 8 1 6 2 10 3 7 4 9 5


 * @author NikoBelic
 * @create 16/8/31 00:21
 */
public class QueuePrint
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Deque queue = new LinkedBlockingDeque();
        int k = scanner.nextInt();
        while (k-- > 0)
        {
            int n = scanner.nextInt();
            for (int i = n; i > 0; i--)
            {
                queue.addFirst(i);
                int tmp = (int) queue.getLast();
                queue.removeLast();
                queue.addFirst(tmp);
            }
            while (queue.size() > 0)
            {
                System.out.print(queue.pop());
                if (queue.size() != 1)
                    System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
