package AK_01_Array;

import java.util.Arrays;

public class AK_16_FirstLastPositionOfElement {
    // Time complexity - O(log n)
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(findStartIndex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
}
