import java.util.Arrays;
import java.util.Scanner;

public class TwoSum{

    public int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i , j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args){
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

        TwoSum obj = new TwoSum();
        
        int[] result = obj.twoSum(nums, target);

        if(result.length == 0){
            System.out.println("No pair found.");
        } else {
        System.out.println("Output: " + Arrays.toString(result));
        }

        sc.close();
    }
}