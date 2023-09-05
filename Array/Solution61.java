import java.util.*;

class Solution{
    private staic void swap_number(int[] nums,int i , int j ){
        int t_nums = nums[i];
        nums[i] = nums[j];
        nums[j] = t_nums;
    }

    public static void rearrange_array(int[] nums){
        for(int i=1;i<nums.length;i+=2){
            if(nums[i-1] > nums[i]){
                swap_nums(nums,i-1,i)
            }

            if(i+1<nums.length && nums[i+1]> nums[i]){
                swap_nums(nums,i+1,i);
            }
        }
    }

    public static void main(String args[]){
        int[] nums = {1,2,4,0,23,2,2,4,3,21,1};
        System.out.println("Original number: "+Arrays.toString(nums));
        rearrange_array(nums);
        System.out.println("Array: "+Arrays.toString(nums));
    }
}