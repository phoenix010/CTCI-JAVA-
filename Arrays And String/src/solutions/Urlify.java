package solutions;

public class Urlify {
    public static void main(String[] args) {
        String str = "Mr John Smith";
        System.out.println("Replace spaces with %20");
        System.out.println("Input: "+ str);
        System.out.println("Output: "+ outOfOrder(str));
        System.out.println("Output: "+ inPlace(str));
    }

    public static String outOfOrder(String str){
//        char[] arr = str.toCharArray();
//        for(int i=0; i< arr.length;i++){
//            if(Character.isWhitespace(arr[i])){
//                Character.
//}
        str = str.replace(" ","%20");
        return str;
    }
    public static String inPlace(String str){
        char[] strChar = str.toCharArray();
        int count = 0; //count spaces in the string to recalculate the array length
        for (char c : strChar) {
            if (c == ' ') {
                count++;

            }

        }
        System.out.println(strChar.length);

        if (count == 0) { // if there are no spaces in the string, return it
            return str;
        }
        return "Hello";
    }
}
