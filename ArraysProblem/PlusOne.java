package Leetcode.ArraysProblem;

public class PlusOne {

    public static void main(String[] args) {
//        int [] arr = {1,2,3};
//        plusOne(arr);
        int [] arr = {1,9,9};
        int [] result = plusOne2(arr);
        printArray(result);

    }

    // this is my approach and the worst case time complexity is O(n)
    public static void plusOne(int [] digits){
        int num = 0;
        int mul = 1;
        for(int i = digits.length - 1 ; i >=0 ; i--){
            int val = mul * digits[i];
            num = num + val;
            mul = mul * 10;
        }

        num++;
        int temp = num;
        int count = 0;
        while (temp > 0){
            temp = temp /10;
            count++;
        }
        System.out.println(count);
        int [] digit2 = new int[count];
        System.out.println(num);
        for(int i = digit2.length - 1 ; i >= 0 && num > 0 ; i-- , num = num /10){
            digit2[i] = num % 10;
        }
        for(int i = 0 ; i < digit2.length ; i++){
            System.out.print(digit2[i] + " ");
        }

    }

    // this is the optimal approach
    public static int[] plusOne2(int [] digits){
        for(int i = digits.length - 1 ; i>= 0 ; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void printArray(int []arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
