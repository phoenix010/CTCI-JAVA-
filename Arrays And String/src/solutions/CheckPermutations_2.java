package solutions;

public class CheckPermutations_2 {
    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];

            //Approach 1: Using inbuilt sorting algo in JAVA
            boolean result = sorting(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + result);

            //Approach 2: Using ASCII code
            boolean result2 = code(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + result2);
            //Appraoch 3: Using HashTable/HashSet
        }
    }

    public static String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static boolean sorting(String s, String t) {
        return sort(s).equals(sort(t));
    }


    public static boolean code(String s, String t){
        if (s.length() != t.length()) return false; // Permutations must be same length

        int[] letters = new int[128]; // Assumption: ASCII
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            letters[t.charAt(i)]--;
            if (letters[t.charAt(i)] < 0) {
                return false;
            }
        }

        return true; // letters array has no negative values, and therefore no positive values either

    }
}