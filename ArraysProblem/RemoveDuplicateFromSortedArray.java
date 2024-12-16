package Leetcode.ArraysProblem;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int arr1[] = {1,1,2};
        int arr2[] = {0,0,1,1,1,2,2,3,3,4};
        int result1 = removeDuplicates(arr1);
        int result2 = removeDuplicates(arr2);
        System.out.println("No. of distinct values in the array is : " + result1);
        System.out.println("No. of distinct values in the array is : " + result2);


    }

    public static int removeDuplicates(int [] nums){
        int k = 1;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] != nums[i - 1]){
                nums[k] = nums[i];
                k++;
                }
            }
        System.out.print("The remaining array is : ");
        for(int i : nums){
            System.out.print(i + " ");
        }
        System.out.println();
        return k;
    }
}
