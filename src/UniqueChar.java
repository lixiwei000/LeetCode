/**
 *
 Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

 Examples:

 s = "leetcode"
 return 0.

 s = "loveleetcode",
 return 2.
 * @author NikoBelic
 * @create 16/9/5 23:51
 */
public class UniqueChar
{
    public int firstUniqChar(String s)
    {
        if (s.equals(""))
            return -1;
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++)
        {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++)
        {
            if (arr[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        UniqueChar test = new UniqueChar();
        test.firstUniqChar("cc");
    }
}
