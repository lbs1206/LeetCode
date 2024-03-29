class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length -1;
        
        while(left < right){
            int mid = (left + right) /2;
            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[mid + 1] <= nums[right] ){
                if(nums[mid + 1] <= target && target <= nums[right]){
                    left  = mid +1;
                }else {
                    right = mid -1;
                }
            }else{
                if(nums[left] <= target && target <= nums[mid -1]){
                    right = mid -1;
                }else{
                    left = mid +1;
                }
                
            }

        }
        return nums[left] == target ? left : -1;
    }
}