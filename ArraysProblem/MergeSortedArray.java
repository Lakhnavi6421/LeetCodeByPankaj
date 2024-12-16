package Leetcode.ArraysProblem;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,0,0,0};
        int [] arr2 = {2,5,6};
        int m = 3;
        int n = 3;
        mergeSortedArray(arr1, m, arr2, n);
    }

    public static void mergeSortedArray(int [] nums1, int m, int [] nums2, int n){

        int midx = m-1;
        int nidx = n-1;
        int right = m+n-1;

        while (nidx >= 0){
            if(midx >= 0 && nums1[midx] > nums2[nidx]){
                nums1[right] = nums1[midx];
                midx--;
            }
            else {
                nums1[right] = nums2[nidx];
                nidx--;
            }
            right--;
        }
        for(int i : nums1){
            System.out.print(i + " ");
        }
    }
}
