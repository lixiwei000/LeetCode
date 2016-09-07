package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author NikoBelic
 * @create 9/6/16 23:41
 */
public class TwoSums
{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer,Integer> pairs = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0 ; i < nums.length ; i++)
        {
            if (pairs.containsKey(target - nums[i]))
            {
                result[0] = pairs.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            pairs.put(nums[i],i);
        }
        return result;
    }
}
