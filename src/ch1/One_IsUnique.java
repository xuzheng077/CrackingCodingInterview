package ch1;

/**
 * @author Xu Zheng
 * @description
 */
public class One_IsUnique {
    // assume the string only contains 128 ASCII characters (better ask the interviewer)
    // better ask how to handle null input or str with length 0
    private static boolean isUnique(String str) {
        //if str longer than 128, return false
        if (str.length() > 128) {
            return false;
        }
        //use a boolean array of length 128
        boolean[] arr = new boolean[128];
        //go over the str
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)]){
                return false;
            }
            arr[str.charAt(i)] = true;
        }
        return true;
    }

    //if not using additional data structure
    //1. O(n^2) comparison
    //2. sort the string first using O(nlogn), then use O(n) to compare neighboring characters for once

    public static void main(String[] args) {
        String test1 = "";
        String test2 = "abcde";
        String test3 = "abcda";
        System.out.println(isUnique(test1));
        System.out.println(isUnique(test2));
        System.out.println(isUnique(test3));
    }
}
