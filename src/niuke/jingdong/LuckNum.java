package niuke.jingdong;

import java.util.Arrays;

/**
 * @author NikoBelic
 * @create 16/9/6 10:29
 */
public class LuckNum
{
    public static void main(String[] args)
    {
        int n = 1000000;
        String num = "4";
        while (--n > 0)
        {
            System.out.println(num);
            int len = num.length();
            // 包含4就将最小位进为7
            if (num.contains("4"))
            {
                // 4变7
                int lastIndex4 = num.lastIndexOf("4");
                num = num.substring(0, lastIndex4) + "7";
                int c = len - num.length();
                for (int i = 0 ; i < c; i++)
                {
                    num += "4";
                }
            } else if (num.indexOf("4") == -1)
            {
                // 全都是7  加一位数
                num = num.replaceAll("7", "4");
                num += "4";
            }
        }
        System.out.println(num);
    }
}
