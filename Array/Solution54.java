import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution54{

    public static boolean find_subarray(int[] nums){
        Set<Integer> set  = new HashSet<>();
        set.add(0);
        int sub_sum = 0;

        for(int i=0; i<nums.length;i++){
            sub_sum += nums[i];

            if(set.contains(sub_sum)){
                return true;
            }
            set.add(sub_sum);
        }
        return false;
    }

    public static void main(String args[]){
        int[] num1 = {1,2,-2,3,4,5,6};
        System.out.println("Original array: "+Arrays.toString(nums1));
		System.out.println("Does the said array contain a subarray with 0 sum: "+find_subarray(nums1));	
    }
}