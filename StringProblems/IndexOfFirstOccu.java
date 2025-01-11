package Leetcode.StringProblems;

public class IndexOfFirstOccu {

    public static int solution(String haystack, String needle){
//        if(needle.isBlank() || needle.isEmpty()){
//            return 0;
//        }
//        int len1 = haystack.length();
//        int len2 = needle.length();
//        int p = 0 ;
//        int q = 0;
//        while (p < len1){
//            if(haystack.charAt(p) == needle.charAt(q)){
//                if(len2 == 1){
//                    return p;
//                }
//                ++p;
//                ++q;
//            }else{
//                p = p - q - 1;
//                q = 0;
//            }
//            if(q == len2){
//                return p - q;
//            }
//        }
//        return -1;

        for(int i = 0, j = needle.length() ; j <= haystack.length(); i++, j++)
        {
            if(haystack.substring(i,j).equals(needle))
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution("sadbutsad", "sad"));
        System.out.println(solution("leetcode", "leeto"));
    }

}
