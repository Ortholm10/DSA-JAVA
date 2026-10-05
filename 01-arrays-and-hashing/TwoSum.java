import java.util.*;
public class TwoSum
{
    public static  int[] twoSum(int[] nums, int target) 
    {
      HashMap<Integer,Integer> hash = new HashMap<>();
      for(int i = 0 ; i<nums.length ; i++)
      {
        int a = target - nums[i];
        if(hash.containsKey(a))
        {
            return new int[]{i , hash.get(a)};
        }
        else
        {
            hash.put(nums[i],i);
        }
    }
    return new int[]{};
        
    }

    public static void main(String[]args)
    {
        int arr[] = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }
}