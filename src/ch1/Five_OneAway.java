package ch1;

/**
 * @author Xu Zheng
 * @description
 */
public class Five_OneAway {
    private static boolean oneEditAway(String s1, String s2) {
        boolean found = false;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    if (found) {
                        return false;
                    }
                    found = true;
                }
            }
        } else if (Math.abs(s1.length() - s2.length()) == 1) {
            int index1 = 0, index2 = 0;
            String str1 = s1.length() < s2.length() ? s1 : s2;
            String str2 = s1.length() < s2.length() ? s2 : s1;
            while (index1 < str1.length() && index2 < str2.length()) {
                if (str1.charAt(index1) != str2.charAt(index2)){
                    if (found){
                        return true;
                    }
                    found = true;
                    index1++;
                }else {
                    index1++;
                    index2++;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(oneEditAway("", ""));
        System.out.println(oneEditAway("", "b"));
        System.out.println(oneEditAway("a", "b"));
        System.out.println(oneEditAway("pae", "pale"));
        System.out.println(oneEditAway("pales", "paes"));
        System.out.println(oneEditAway("pawe", "pave"));
        System.out.println(oneEditAway("paxye", "pamne"));
    }
}
