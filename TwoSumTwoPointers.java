import java.util.*;

public class TwoSumTwoPointers {

    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int left = 0;
        int right = n-1;

        while(left < right) {

            int sum = nums[left] + nums[right];
            if (sum == target){
                return new int[]{left+1, right+1};
            }
            else if(sum > target){
                right --;
            }
            else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Please enter at least one element.");
            sc.close();
            return;
        }

        int[] nums = new int[n];

        System.out.println("Enter array elements: ");

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        TwoSumTwoPointers obj = new TwoSumTwoPointers();
        int[] result = obj.twoSum(nums, target);

        System.out.println("Output:" + Arrays.toString(result));

        sc.close();
    }
}
