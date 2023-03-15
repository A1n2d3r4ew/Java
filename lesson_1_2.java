package Java;



public class lesson_1_2 {
    public static void main(String[] args) {
        String[] array = {"abc", "abcdef", "abcggggg", "abeee"};

        String commonPrefix = findCommonPrefix(array);

        System.out.println(commonPrefix);
    
        
    }

    static String findCommonPrefix(String[] array) {
        String first = array[0];
        for (int i = 1; i < array.length; i ++) {
            if (first.length() > array[i].length()) {
                first = array[i];
            }
        }

        String result = "";
        // String firstString = array[0];
        first: for (int index = 0; index < first.length(); index++) {
            for (int i = 1; i < array.length; i++) {
                // String second = array[i];
                //String second = array[i + 1];

                char firstStringChar = first.charAt(index);
                char secondStringChar = array[i].charAt(index);

            
                // char[] chars = first.toCharArray();
                // char aChar = chars[index];            1 способ

                if (firstStringChar != secondStringChar) {
                    break first;
                }
            }
            result += first.charAt(index);
        }

        return result;
    }

}
