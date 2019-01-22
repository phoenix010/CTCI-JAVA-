package solutions;

import java.util.Arrays;

public class OneAway {
    public static void main(String[] args) {
        System.out.println("One Away");
        String str = "pale";
        String str1 = "pal";
        if(checkEdits(str,str1)){
            System.out.println(str +","+ str1 +" -> true");
        }
        else
            System.out.println(str +","+ str1 +" -> false");
    }

    public static boolean checkEdits(String str , String str1){
        int cnt = 0;
        if(str.length() - str1.length() < 1 )
            return false;
        char[] arr = str.toCharArray();
        char[] arr1 = str1.toCharArray();

        for(int i=0 ; i<arr.length;i++){
            for(int j=0; j<arr1.length;j++){
                if(!Arrays.equals(arr,arr1)){
                    cnt++;
                    if(cnt >1)
                        return false;
                }
                else


            }
        }
    }
}

