package ch1;

/**
 * @author Xu Zheng
 * @description
 */
public class Nine_StringRotation {
    private static boolean isSubString(String s1, String s2) {
        //some implementation already provided
        return true;
    }

    private static boolean isRotation(String s1, String s2) {
        if (s1.length() == s2.length() && s1.length() > 0) {
            return isSubString(s1 + s1, s2);
        }
        return false;
        //if isSubString is linear, this is O(n) time
    }
}
