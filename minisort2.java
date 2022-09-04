public class minisort2 {
        public int findMin(int[] nums) {
            int l=0;
            int r=nums.length-1;
            while(l<r){
                int mid=l+(r-l)/2;
                if(nums[mid]>nums[r]){
                    l=mid+1;
                }
                else if(nums[mid]<nums[r]){
                    r=mid;
                }
                else{
                    r--;
                }
            }
            return nums[l];
        }
    }
