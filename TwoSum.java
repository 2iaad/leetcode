import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class TwoSum {
    // public static int [] twoSum(int[] nums, int target) {
        
    //     for (int i = 0; i < nums.length; i++)
    //     {
    //         for (int j = i + 1; j < nums.length; j++)
    //         {
    //             if (nums[i]  + nums[j] == target)
    //             {
    //                 return new int[] {i , j};
    //             }
    //         }
    //     }
    //     return new int[] {};
    // }
    
    public static int [] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< nums.length; i++)
        {
            int lookFor = target - nums[i];
            if (map.containsKey(lookFor)) // then lookFor + nums[i] = target
            {
                System.out.println("Found!");
                return new int[] {map.get(lookFor), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] arr = {11, 1336, 3, -4, 1, 0, 33};
        int target = 1337;

        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}

