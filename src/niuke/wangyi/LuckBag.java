package niuke.wangyi;

import java.util.Scanner;

/**
 一个袋子里面有n个球，每个球上面都有一个号码(拥有相同号码的球是无区别的)。如果一个袋子是幸运的当且仅当所有球的号码的和大于所有球的号码的积。
 例如：如果袋子里面的球的号码是{1, 1, 2, 3}，这个袋子就是幸运的，因为1 + 1 + 2 + 3 > 1 * 1 * 2 * 3
 你可以适当从袋子里移除一些球(可以移除0个,但是别移除完)，要使移除后的袋子是幸运的。现在让你编程计算一下你可以获得的多少种不同的幸运的袋子。
 输入描述:
 第一行输入一个正整数n(n ≤ 1000)
 第二行为n个数正整数xi(xi ≤ 1000)


 输出描述:
 输出可以产生的幸运的袋子数

 输入例子:
 3
 1 1 1

 输出例子:
 2
 * @author NikoBelic
 * @create 16/9/3 22:15
 */
public class LuckBag
{
    public static boolean isLuck(int[] balls)
    {
        int sum = 0 ;
        int mul = 1;
        for (int i = 0; i < balls.length; i++)
        {
            sum += balls[i];
            mul *= balls[i];
        }
        if (sum > mul)
            return true;
        return false;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] balls = new int[n];
        int luckNums = 0;
        for (int i = 0; i < n; i++)
        {
            balls[i] = scanner.nextInt();
        }
        int[] tmp = balls;
        if (isLuck(balls))
            luckNums++;
        // 拿走remove个球
        for (int remove = 0;remove < n-1;remove++)
        {
            for (int i = 0; i < balls.length; i++)
            {
                // 取出第i个球
                for (int j = 0; j < balls.length; j++)
                {
                    if (j != i)
                        tmp[j] = balls[i];
                }
                // 输出tmp
                for (int j = 0; j < tmp.length; j++)
                {
                    System.out.print(tmp[j] + " ");
                }
                System.out.println("");
                if (isLuck(tmp))
                    luckNums++;
            }
        }
        System.out.println("result:" + luckNums);
    }
}
