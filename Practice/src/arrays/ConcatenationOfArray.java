package arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {

        int[] nums = {1,2,1};

        printArray(getConcatenation(nums));
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        for(int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    private static void printArray(int[] input) {

        for (int element : input) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }
}
