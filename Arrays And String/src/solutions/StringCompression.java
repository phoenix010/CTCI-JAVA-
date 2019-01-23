package solutions;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaadddsaq";
        String str1 = compressed(str);
    }

    public static String compressed(String str){
        // char[] arr = str.toCharArray();
        /**
         * Algo:
         * move one pointer from the start of the string, and another pointer which would start
         * at index 1.if both characters mach then we print that character and the "frequency" in
         * a new constructed char array. In order to calculate the frequency, you have to move the second
         * cursor through the input String.
         */
        int len = str.length();
        int i =0;
        while(i<len){
            if(str.charAt(i) == str.charAt(i+1)){

            }
        }




        return str;
    }

}
