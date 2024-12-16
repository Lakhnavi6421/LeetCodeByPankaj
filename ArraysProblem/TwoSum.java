package Leetcode.ArraysProblem;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int [] arr1 = {2,7,11,15};
        int [] arr2 = {3,2,4};
        int [] arr3 = {3,3};
        int target1 = 9;
        int target2 = 6;
        int target3 = 6;

        int[] result1 = ts.twoSum(arr1, target1);
        int[] result2 = ts.twoSum(arr2, target2);
        int[] result3 = ts.twoSum(arr3, target3);


        if(arr1[result1[0]] + arr1[result1[1]] == target1)
            System.out.println("Test Case 1 Passed");
        else
            System.out.println("Test Case 1 Failed");

        if(arr2[result2[0]] + arr2[result2[1]] == target2)
            System.out.println("Test Case 2 Passed");
        else
            System.out.println("Test Case 2 Failed");

        if(arr3[result3[0]] + arr3[result3[1]] == target3)
            System.out.println("Test Case 3 Passed");
        else
            System.out.println("Test Case 3 Failed");


    }

    public int[] twoSum(int[] nums, int target){
        for(int i = 0 ; i < nums.length ; i++)
        {
            for(int j = i+1; j< nums.length ; j++)
            {
                if(nums[i] + nums[j] == target)
                    return new int[] {i,j};
            }
        }
        return new int[] {};
    }

}
