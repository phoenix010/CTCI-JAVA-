package solutions;

import java.util.Arrays;
import java.util.Scanner;

//link: https://stackoverflow.com/questions/19484406/detecting-if-a-string-has-unique-characters-comparing-my-solution-to-cracking
//link: https://www.geeksforgeeks.org/determine-string-unique-characters/
public class IsUnique_1 {
    public static void main(String[] args) {
        System.out.println("Eneter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        //Approach 1- this is a brute force method with O(n^2)
        if(bruteForce(str))
            System.out.println( str+" has all unique characters");
        else
            System.out.println(str+" has duplicate characters");
        //Approach 2 – Sorting: Using sorting based on ASCII values of characters
        //runtime: O(n logn)
        if(sorting(str))
            System.out.println( str+" has all unique characters");
        else
            System.out.println(str+" has duplicate characters");
        //Approach 3: Using a inbuilt sorting algo
        //runtime: O(nlogn)
        if(isUniqueChars(str))
            System.out.println( str+" has all unique characters");
        else
            System.out.println(str+" has duplicate characters");
        //Approach 4: Using a ASCII in java
        //Approach 5: Using HashSet/ HashMap
        //Approach 6: Using bitwise operator in-order to avoid any data structure

    }

    public static boolean bruteForce(String str){
        for(int i=0; i< str.length(); i++)
            for(int j = i+1; j< str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j))
                    return false;

            }
        return true;
    }

    public static boolean sorting(String str){
        char[] arr = str.toCharArray();
        Arrays.sort((arr));
        for(int i=0; i< arr.length -1;i++){
            if(arr[i] == arr[i+1])
                return false;
            else
                continue;
        }
        return true;
    }
    public static boolean isUniqueChars(String str) {
        if (str.length() > 256) { // NOTE: Are you sure this isn't 26?
            return false;
        }
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }
    public static void HasUniqueChar(String str) {
    }
}
