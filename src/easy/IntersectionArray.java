package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author NikoBelic
 * @create 16/8/16 23:03
 */
public class IntersectionArray
{
    public int[] intersect(int[] nums1, int[] nums2)
    {
        int[] result = new int[Math.max(nums1.length,nums2.length)];
        int k = 0;
        for (int i = 0; i < nums1.length; i++)
        {
            for (int j = 0; j < nums2.length; j++)
            {
                if (nums1[i] == nums2[j])
                {
                    result[k++] = nums1[i];
                    nums1[i] = Integer.MIN_VALUE;
                }
            }
        }
        int[] finalR = new int[result.length];
        int m = 0;
        for (int i : result)
        {
            finalR[m++] = i;
        }
        return finalR;
    }
    public static void main(String[] args)
    {
        IntersectionArray t = new IntersectionArray();
        t.intersect(new int[]{1},new int[]{1,1});
    }
}
