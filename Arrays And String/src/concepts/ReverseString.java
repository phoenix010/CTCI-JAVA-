package concepts;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter String:");
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        String rev ="";
//        System.out.println(str.length());

        //Java String charAt method throws IndexOutOfBoundsException,
        // if the index value passed in the charAt() method is less than zero
        // or greater than or equal to the length of the string (index<0|| index>=length()).
        for(int i= str.length() -1  ; i>=0; i--){
            rev = rev + str.toLowerCase().charAt(i);
        }
        System.out.println("Reversed String is: "+rev);
//        System.out.println(rev.length());
    }
}