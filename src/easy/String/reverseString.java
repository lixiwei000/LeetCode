package easy.String;

/**
 * @author NikoBelic
 * @create 16/6/20 21:53
 */
public class ReverseString
{
    public String reverseString(String s)
    {
        char tmp;
        int length = s.length();
        if (length <= 0)
            return "";
        int i = 0;
        char[] sArr = s.toCharArray();
        while (true)
        {
            if (length == 1)
                return s;
            else if (i <= length / 2 - 1)
            {
                tmp = sArr[i];
                sArr[i] = sArr[length - i - 1];
                sArr[length-i-1] = tmp;
                i++;
                continue;
            }
            break;
        }
        return String.valueOf(sArr);
    }

    public static void main(String[] args)
    {
        ReverseString r = new ReverseString();
        System.out.println(r.reverseString("hello"));
    }
}