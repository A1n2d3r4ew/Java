package Java;

public class lesson_2 {
    public static void main(String[] args) {
        String s = "aaaabbbcdd";
        String compressed = compress(s);
        System.out.println(compressed);
        
    }

    /**
     * aaaabbbcdd -> a4b3cd2
     */

    static String compress(String input) {
        String result = "";
        int count = 1;
        char tmp = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);
            if (tmp == c) {
                count++;
            } else {
                if (count > 1) {
                    result += tmp;
                    result += count;
                } else {
                    result += tmp;
                }
                tmp = c;
                count = 1;
            }
        }
        if (count > 1) {
            result += tmp;
            result += count;
        } else {
            result += tmp;
        
        }
        return result;
    }
}
