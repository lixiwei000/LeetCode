package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NikoBelic
 * @create 16/7/27 23:34
 */
public class MajorityElement
{
    public int majorityElement(int[] num)
    {
        //Map<Integer,Integer> acc = new HashMap<>();
        //for (int n : nums)
        //{
        //    acc.put(n,acc.get(n)==null?1:acc.get(n)+1);
        //    if (acc.get(n) > Math.floor(nums.length / 2.0))
        //        return n;
        //}
        //return Integer.MIN_VALUE;
        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }
    public static void main(String[] args)
    {
        MajorityElement m = new MajorityElement();
        int s = m.majorityElement(new int[]{1,1,1,1,1,1,2,3,3,3,3});
        System.out.println(s);
    }
}
