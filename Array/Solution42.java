import java.util.*;
public class Solution42{
    public static void main(String args[]){
        int nums[] = {0,1,1,0,0,1,0,1,1,1,0,0,1,0,1};
        int i , num_size = nums.length;
        int left = 0,right = num_size-1;
        System.out.println("Original array: "+Arrays.toString(nums));

        while(left < right){
            while(nums[left] ==0 && left < right)
                left++;
            
            while(nums[left] == 0 && left<right)
                right++;

            if(left<right){
                nums[left] = 0;
                nums[right] = 1;
                left++;
                right--;
            }
        }
        System.out.println("Arrays after sagregration: "+Arrays.toString(nums));
    }
}