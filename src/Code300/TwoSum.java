package Code300;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private int[] nums;
    private int target;

    public TwoSum(int[] nums, int target) {
     this.nums = nums;
     this.target = target;
    }

    // c1
    public int[] twoSum() {
        for(int i = 0 ; i < nums.length ; i++) {
            int iten1 = nums[i];
            for(int j = 0 ; j < nums.length ; j++) {
                if( iten1 + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    //c2
    public int[] twoSum2() {
      Map<Integer, Integer> map = new HashMap<>();

      for(int i = 0 ; i < nums.length ; i++) {
          // nums[i] + x = target => x = target - num[x]
           int kq = target - nums[i];
          if(map.containsKey(kq)) {
              return new int[]{map.get(kq), i};
          }
          map.put(nums[i], i);
      }
      return null;
    }
}

