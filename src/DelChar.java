import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author NikoBelic
 * @create 16/8/2 20:02
 */
public class DelChar
{
    public static int del(String s)
    {
        if (s == null || s.equals(""))
            return 0;

        int len = s.length();
        Set<String> res = new HashSet<>();
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = i; j < s.length(); j++)
            {
                if (j != i)
                {
                    char[] chars = s.toCharArray();
                    chars[i] = ' ';
                    chars[j] = ' ';
                    String r = "";
                    for (int k=0;k<chars.length;k++)
                    {
                        if (chars[k] != ' ')
                        {
                            r += chars[k];
                        }
                    }
                    System.out.println(r);
                    res.add(r);
                }
            }
        }
        return res.size();
    }

    public static void main(String[] args)
    {
        System.out.println(del("aaaa"));
    }
}
