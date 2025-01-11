package Leetcode.StringProblems;

public class RomanToInteger {

    public static int getVal(char ch){
        switch (ch){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return 0;
        }
    }

    public static int convert(String s){
        int sum = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch1 = s.charAt(i);
            if((i+1) < s.length() && getVal(ch1) < getVal(s.charAt(i+1))){
                sum = sum - getVal(ch1);
            }else{
                sum = sum + getVal(ch1);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s1 = "IV";
        String s2 = "MCMXCIV";
        String s3 = "IX";
        System.out.println(convert(s1));
        System.out.println(convert(s2));
        System.out.println(convert(s3));
    }
}
