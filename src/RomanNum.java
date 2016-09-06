/**
 *
 Given a roman numeral, convert it to an integer.

 Input is guaranteed to be within the range from 1 to 3999.
 Ⅰ  （1）  Ⅴ  （5）  Ⅹ  （10）  L  （50）  C  （100）  D  （500）  M  （1000）
 * @author NikoBelic
 * @create 16/9/6 00:39
 */
public class RomanNum
{
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
        {
            switch (s.charAt(i))
            {
                case 'M':sum += 1000;
                    break;
                case 'D':sum += 500;
                    break;
                case 'C':sum += sum> 500?-100:100;
                    break;
                case 'L':sum += 50;
                    break;
                case 'X':sum += sum > 50? -10 : 10;
                    break;
                case 'V':sum += 5;
                    break;
                case 'I':sum += sum > 5?-1 : 1;
                    break;
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        RomanNum t = new RomanNum();
        System.out.println(t.romanToInt("MCMXCVI"));
    }
}
