package basic;

public class FirstandLastInArraySum {
    static void main() {
        int[] nums = {2, 3, 4, 5, 6};
        int startIndex = nums[0];
        int endIndex = nums.length -1;
        int lastIndex = nums[endIndex];
        System.out.println(startIndex+lastIndex);
    }
}
