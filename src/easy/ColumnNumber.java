package easy;

/**
 * @author NikoBelic
 * @create 16/7/26 23:48
 */
public class ColumnNumber
{
    int m = 0;
    public int titleToNumber(String s)
    {
        //int result = 0;
        //for (int i = 0; i < s.length();  i++)
        //{
        //    result = result * 26 + (s.charAt(i) - 'A' + 1);
        //}
        //return result;
        int sum = 0;
        for (int i=0;i<s.length();i++)
        {
            sum = sum + (int)Math.pow(26, i) * (s.charAt(s.length()-i-1) - 'A' + 1);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        ColumnNumber t = new ColumnNumber();
        System.out.println(t.titleToNumber("A"));
    }
}
