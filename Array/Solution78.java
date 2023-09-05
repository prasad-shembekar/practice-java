import java.util.Scanner;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums = {1,-2, -5,-4,3,-6};
    //int[] nums = {1, 2, 5, -4, 3, -6};
    //int[] nums = {1, 2, -5, -4, -3, 6};
    System.out.printf("\nOriginal array of numbers:\n" + Arrays.toString(nums));
    boolean result = test(nums);
    System.out.printf("\nCheck Negative Dominance in the said array!" + result);
  }
  public static boolean test(int[] nums) {
    long count_negative, count_positive;
    nums = Arrays.stream(nums).distinct().toArray();
    count_negative = Arrays.stream(nums).filter(s -> s < 0).count();
    count_positive = Arrays.stream(nums).filter(s -> s > 0).count();
    return count_negative > count_positive;
  }
}
