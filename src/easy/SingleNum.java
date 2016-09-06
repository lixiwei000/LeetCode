package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * @author NikoBelic
 * @create 16/9/3 15:04
 */
public class SingleNum
{
    public int getSingleNum(int[] nums)
    {
        Map<Integer,Integer> pairs = new HashMap<>();
        for (int num : nums)
        {
            pairs.put(num,pairs.get(num)==null?1:pairs.get(num) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : pairs.entrySet())
        {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return 0;
    }
}
