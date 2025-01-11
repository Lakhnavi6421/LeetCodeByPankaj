package Leetcode.StringProblems;

public class SumOfDigitsOfStringAfterConvert {

    public static int solution(String s , int k){
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            sb.append(ch - 'a' +1);
        }
        s = sb.toString();
        while (k-- > 0){
            int t = 0;
            for(char ch : s.toCharArray()){
                t = t + ch - '0';
            }
            s = String.valueOf(t);
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        String s1 = "pankaj";
        String s2 = "zbax";
        String s3 = "iiii";
        System.out.println(solution(s1, 2));
        System.out.println(solution(s2, 1));
        System.out.println(solution(s3, 1));
    }
}
