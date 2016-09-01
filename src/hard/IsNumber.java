package hard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author NikoBelic
 * @create 16/7/28 00:08
 */
public class IsNumber
{
    public boolean isNumber(String s)
    {
        int count = 0;
        s = s.trim();
        if (s.length() ==0 )
            return false;
        try
        {
            if (s.toCharArray()[0] == 'e'
                    || (s.lastIndexOf('.') == s.length()-1) && s.toCharArray()[0] == '.'
                    || s.lastIndexOf('e') == s.length()-1
                    || (s.lastIndexOf('.')!=-1)&&s.lastIndexOf('.')<s.lastIndexOf('e') && s.lastIndexOf('e') == s.length()-1
                    || (s.lastIndexOf('e')!=-1)&&s.lastIndexOf('e')<s.lastIndexOf('.')
                    || (s.toCharArray()[0] =='.' && s.lastIndexOf('e') != -1)
                    )
                return false;
            if (s.toCharArray()[0] != '-' && s.indexOf('-') > 0)
                return false;
            if (s.toCharArray()[0] != '+' && s.indexOf('+') > 0)
                return false;
        }
        catch(Exception e)
        {
            return false;
        }
        Map<Character,Integer> acc = new HashMap<>();
        for (char c : s.toCharArray())
        {
            acc.put(c,acc.get(c)==null?1:acc.get(c)+1);
        }
        if ((acc.get('.')!=null &&  acc.get('.') > 1)
                || (acc.get('e')!=null && acc.get('e')> 1)
                || (acc.get('-')!=null && acc.get('-')> 1)
                || (acc.get('+')!=null && acc.get('+')> 1)
                )
            return false;
        Set<Character> keys = acc.keySet();
        for (char c : keys)
        {
            if (c == 'e' || c == '.' || c == '-' || c == '+')
                continue;
            try
            {
                Integer.parseInt(String.valueOf(c));
                count++;
            }
            catch (Exception e)
            {
                return false;
            }
        }
        if (count == 0)
            return false;
        return true;
    }
    public static void main(String[] args)
    {
        IsNumber t = new IsNumber();
        System.out.println(t.isNumber(".e1"));
    }
}
