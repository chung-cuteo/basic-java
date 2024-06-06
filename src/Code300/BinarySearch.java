package Code300;

public class BinarySearch {
//    // c1 Linear Search , thuong do dai mang ngan ok, ko can sap sep
//    public int search(int[] nums, int target) {
//        int index;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target)  return i;
//        }
//
//        return -1;
//    }

    //c2 binary search chia nua mang ra tim kiem se nhanh hon, nhung phai sap sep
    public int search(int[] nums, int target) {
        // 2, 3, 4, 20,
        // target: 20
        // [2,3] [4,20]
        //  left:0, right: 4
        // vong1
        // mid = 0 + (3 -0) / 2 => 2
        // point: nums[2]= 4
        // if(point == 20) false => ko chay block nay
        // if(point < 20) true, chay nguyen phia ben phai, khi nay left se di chuyen tu 0 den mid + 1
        // left <= right true, chay vong 2
        // mid = 3 , point: nums[3]=20, point === target return mid;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = nums.length / 2;
            int point = nums[mid];

            if (point == target) {
                return mid;
            }
            if (point < target) {
                left = mid + 1;
            }
            if (point > target) {
                right = mid - 1;
            }
        }

        return -1;
    }
}
