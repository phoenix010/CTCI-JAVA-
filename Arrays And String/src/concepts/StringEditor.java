package concepts;

public class StringEditor {
    public static void main(String[] args) {
        String str = "qweryuY@12ui4t";
        System.out.println("Remove all the characters from the above string.Using StringBuilder for editing Strings");

        StringBuilder sb = new StringBuilder(str);

        String result = convert(sb);
        System.out.println("The Converted String is: "+result);
    }

    public static String convert(StringBuilder sb){
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)<48 || sb.charAt(i)>57){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
}
