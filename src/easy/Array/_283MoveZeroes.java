package easy.Array;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p/>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * <p/>
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 *
 * @author NikoBelic
 * @create 10:08
 */
public class _283MoveZeroes
{
    /**
     * Solution1:遍历数组,将下一个直到不是0的数与前面的数对调
     * 效率:击败了6%的人
     * @param nums
     */
    public void moveZeroes1(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] == 0 && nums[i + 1] != 0)
            {
                int t = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = t;
            }
            else if (nums[i] == 0 && nums[i + 1] == 0)
            {
                for (int j = i; j < nums.length; j++)
                {
                    if (nums[j] == 0)
                        continue;
                    else
                    {
                        int t = nums[i];
                        nums[i] = nums[j];
                        nums[j] = t;
                        break;
                    }
                }
            }
        }
    }

    /**
     * 击败了23.38%
     * @param nums
     */
    public void moveZeros2(int[] nums)
    {
        int index = 0;
        for (int i=0; i<nums.length; i++)
        {
            if (nums[i] == 0)
                continue;
            while (nums[index] != 0 && index < i)
            {
                index++;
            }
            if (index < i)
            {
                nums[index] = nums[i];
                nums[i] = 0;
            }
        }
        for (int num : nums)
        {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args)
    {
        int[] nums = new int[]{1,1,5,0,0,4,2,5,0,0,0,6,0,0,12,0};
        _283MoveZeroes t = new _283MoveZeroes();
        t.moveZeros2(nums);
    }
}
