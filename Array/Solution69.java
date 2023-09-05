import java.util.*;
class solution {

	public static int [] find_min_subarray_sum(int[] nums, int k)
	{
		int sub_arr_sum = 0;
		int min_sub_arr = Integer.MAX_VALUE;
		int last = 0;
		int[] result = new int[3];

		for (int i = 0; i < nums.length; i++)
		{
			sub_arr_sum += nums[i];

			if (i + 1 >= k)
			{
				if (min_sub_arr > sub_arr_sum)
				{
					min_sub_arr = sub_arr_sum;
					last = i;
				}

				sub_arr_sum -= nums[i + 1 - k];
			}
		}
		result[0] = last - k + 1;
		result[1] = last;
		result[2] = min_sub_arr;
		return result;		
	}

	public static void main(String[] args)
	{
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10};
		int k = 4;
        System.out.printf("\nOriginal array: "+Arrays.toString(nums));
		System.out.printf("\nSub-array size: %d", k);
		int [] result = find_min_subarray_sum(nums, k);
		System.out.printf("\nSub-array from %d to %d and sum is: %d", result[0], result[1], result[2]);
	}
}
