package Leetcode.ArraysProblem;

import java.util.ArrayList;

public class RemoveElement {

    public static void main(String[] args) {
        int[] arr1 = {3,2,2,3};
        System.out.println(removeElement(arr1, 3));

        int[] arr2 = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr2, 2));
    }

    public static void printArray(int [] nums){
        for(int i : nums){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int removeElement(int [] nums, int val){
        int index = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        printArray(nums);
        return index;
    }

}
