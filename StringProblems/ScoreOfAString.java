package Leetcode.StringProblems;

public class ScoreOfAString {

    public static int score(String s){
        int sum = 0;
        if(s.length() == 0){
            return -1;
        }
        if(s.length() == 1){
            sum = s.charAt(0);
            return sum;
        }
        for(int i = 1; i < s.length() ; i++){
            int post = s.charAt(i);
            int pre = s.charAt(i-1);
            if(pre < post){
                sum = sum + post - pre;
            }else{
                sum = sum + pre - post;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(score("h"));
        System.out.println(score(""));
        System.out.println(score("hello"));
        System.out.println(score("zaz"));
    }
}
