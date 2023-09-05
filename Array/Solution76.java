import java.util.Scanner;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums = {1, 2 ,5, 0, 4, 3, 6};
   // int[] nums = {1, 2 ,5, 0, 3, 6, 7};
    System.out.printf("\nOriginal array: " + Arrays.toString(nums));

    boolean result = test(nums);
    System.out.printf("\nCheck consecutive numbers in the said array!" + result);
  }

  public static boolean test(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] + 1 != nums[i+1])
						return false;
		}
		return true;
	}
}
