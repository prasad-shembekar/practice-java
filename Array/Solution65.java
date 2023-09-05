import java.util.Arrays;

class Solution65{
    public static int diff(int[] nums){
        int diff1 = Integer.MIN_VALUE;
        for(int i=0; i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                diff1 = Integer.max(diff1,nums[j]-nums[i]);
            }
        }
        return diff1;
    }

    public static void main(String[] args){
        int[] nums = {2,3,1,7,9,5,11,3,5};
        System.out.println("Original array:"+Arrays.toString(nums));
        System.out.println("Max diff is: "+diff(nums));
    }
}