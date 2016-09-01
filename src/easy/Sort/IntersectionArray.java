package easy.Sort;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

 Note:
 Each element in the result must be unique.
 The result can be in any order.
 * @author NikoBelic
 * @create 16/7/18 23:55
 */
public class IntersectionArray
{
    /**
     * Double HashSet
     * @Author NikoBelic
     * @Date 16/7/19 00:57
     */
    public int[] intersection1(int[] nums1, int[] nums2)
    {
        HashSet<Integer> tmpSet = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for (int i : nums1)
        {
            tmpSet.add(i);
        }
        for (int i : nums2)
        {
            if (tmpSet.contains(i))
                intersection.add(i);
        }
        int[] result = new int[intersection.size()];
        int j = 0;
        for (Integer i : intersection)
        {
            result[j++] = i;
        }
        return result;
    }
    public int[] intersection2(int[] nums1, int[] nums2)
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> interseciton = new HashSet<>();
        int i=0,j=0;
        while (i<nums1.length && j<nums2.length)
        {
            if (nums1[i] < nums2[j])
                i++;
            else if (nums1[i] > nums2[j])
                j++;
            else
            {
                interseciton.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[interseciton.size()];
        int k = 0;
        for (Integer m : interseciton)
        {
            result[k++] = m;
        }
        return result;
    }
    public int[] intersection3(int[] nums1, int[] nums2)
    {
        Set<Integer> set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums1).distinct().filter(e -> set.contains(e)).toArray();
    }
}