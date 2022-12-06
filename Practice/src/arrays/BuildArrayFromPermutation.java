package arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {

        int[] nums = {0,4,1,3,2};
        printArray(buildArray(nums));
    }

    private static void printArray(int[] input) {

        for (int element : input) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
