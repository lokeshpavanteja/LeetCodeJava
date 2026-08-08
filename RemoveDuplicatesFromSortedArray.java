import java.util.*;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements are you going to enter? : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int st = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + st);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < st; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}