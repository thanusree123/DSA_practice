import java.util.*;
class slidling_window5 {
    public  static int longestOnes(int[] nums, int k) {
        // Safety guard for empty arrays
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int left = 0;
        int maxLength = 0;
        int zeroCount = 0; // Tracks how many zeros are inside our current window

        // 'right' expands our window
        for (int right = 0; right < nums.length; right++) {
            // If the incoming element is a 0, record it
            if (nums[right] == 0) {
                zeroCount++;
            }

            // If we have broken our budget of allowed zeros, shrink from the left
            while (zeroCount > k) {
                // If the element leaving our window is a 0, we reclaim that flip
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++; // Move the window tail forward
            }

            // Calculate the window width and track the maximum achieved
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static void main(String args[]){
        int nums[]={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int result=longestOnes(nums,k);
        System.out.print(result);
    }
}