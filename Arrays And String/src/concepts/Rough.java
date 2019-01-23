package concepts;

public class Rough {
    public static void main(String[] args) {
      Rough rh = new Rough();
      System.out.println(rh.getClass().getName());
      String s1 = "Java";
      String s2 = "Python";
      String s3 =s1.concat(s2);
       s1 = "C++";
        System.out.println(s1);
        StringBuilder sb = new StringBuilder("Aditya");
        System.out.println(sb.toString());

    }
}
