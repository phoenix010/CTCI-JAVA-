package solutions;

import java.util.Arrays;

public class PalindromePermutation {
    public static void main(String[] args) {
        String[][] pairs = {{"Aditya","Tyagi"},{"aaa" , "aaa"},{"hello" , "olleh"}};
        for (String[] pair : pairs){
            String str1 = pair[0];
            String str2 = pair[1];
            boolean result = permutation(str1,str2);
            System.out.println(str1 +", "+ str2 +": "+result);

            System.out.println("Need to do using ASCII code: ");

        }
    }

    public static boolean permutation(String str1 , String str2){

        return sorting(str1).equals(sorting(str2));
    }

    public static String sorting(String s){
        char[] content= s.toCharArray();
        Arrays.sort(content);
//        System.out.println("This is content"+content);
//        System.out.println("This is content.toString()"+content.toString());
//        return content.toString();
        return new String(content);
    }
}
