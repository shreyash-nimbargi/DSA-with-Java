class searchInsert {
    public static void main(String args[])
    {
        int nums[] = {1,3,5,6};
        int target = 5;
        searchInsert(nums,target);
        
    }
    public static int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;

        while(left<=right)
        {
            int mid = left + (right - left)/2;

            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] > target)
                {
                    right = mid - 1;
                }
            else
                {
                    left = mid + 1;
                }
            
            
        }
        return left;
    } 
}