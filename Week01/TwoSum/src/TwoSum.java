import java.util.HashMap;
import java.util.Map;

/**
 * 题目：两数之和
 *
 */
public class TwoSum {
    public int[] twoSum(int[] nums ,int target) {

      /*  *//**
         * 第一种解法，暴力解法
          *//*
        for (int i = 0;i < nums.length;i++) {
            for (int j = i+1; j < nums.length;j++) {
               if (nums[j] == target - nums[i]) {
                   return new int[] {i ,j};
               }
            }
        }
        throw new IllegalArgumentException("No two sum solution");*/
        /**
         * 第二种解法：一遍哈希表
         */
        Map<Integer, Integer> map =new HashMap<>();
        for (int i = 0;i < nums.length; i++) {
          int complement =target - nums[i];
          if (map.containsKey(complement)) {
              return new int[] {map.get(complement), i};
          }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
