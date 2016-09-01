package easy;

import java.util.*;

/**
 * @author NikoBelic
 * @create 16/7/27 01:36
 */
public class ValidAnagram
{
    public boolean isAnagram(String s, String t)
    {
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        if (s.length() != t.length())
            return false;
        for (int i=0; i<s.length(); i++)
        {
            sMap.put(sArray[i],sMap.getOrDefault(sArray[i],0)+1);
            tMap.put(tArray[i],tMap.getOrDefault(tArray[i],0)+1);
        }
        if (sMap.size() != tMap.size())
            return false;
        for (Map.Entry<Character,Integer> entry : sMap.entrySet())
        {
            char key = entry.getKey();
            int value = entry.getValue();
            if (tMap.get(key) == null || (value != tMap.get(key)))
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        ValidAnagram t = new ValidAnagram();
        System.out.println(t.isAnagram("a","b"));
    }
}
