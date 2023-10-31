// Search Insert Position Problem - Leetcode: https://leetcode.com/problems/search-insert-position/description/ 
class Solution {
    public int searchInsert(int[] nums, int target) {
        int srch = 0;
        int e = nums.length-1;
        while( srch<= e ) {
            int mid = srch+(e-srch)/2;
            if (target>nums[mid]) {
                srch=mid+1;
            }
            else if(target<nums[mid]) {
                e = mid-1;
            } else {
                return mid;
            }    
        }
        return srch;
    }
}
