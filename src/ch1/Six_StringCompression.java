package ch1;

/**
 * @author Xu Zheng
 * @description
 */
public class Six_StringCompression {
    //there is a seemingly more efficient way in the textbook
    //but I'm gonna stick with this one
    private static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                sb.append(str.charAt(i)).append(count);
                count = 0;
            }
        }
        return sb.length() < str.length() ? sb.toString() : str;
    }

    public static void main(String[] args) {
        System.out.println(compress("a"));
        System.out.println(compress("aa"));
        System.out.println(compress("aaa"));
        System.out.println(compress("aaab"));
        System.out.println(compress("aaabb"));
        System.out.println(compress("aaabbaa"));
    }
}
