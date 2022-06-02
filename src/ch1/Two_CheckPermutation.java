package ch1;

import java.util.Arrays;

/**
 * @author Xu Zheng
 * @description
 */
public class Two_CheckPermutation {
    //better ask if it is case-sensitive and does whitespace also count
    //what is the character set
    //assume it's 128 ASCII and case-sensitive
    private static boolean checkPermutationOne(String s1, String s2) {
        //use a array of 128 to count the number of appearance for each character
        //different length must be false
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] arr = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i)]--;
            if (arr[s2.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
        //it is O(n) time and O(1) space
    }

    private static boolean checkPermutationTwo(String s1, String s2) {
        //different length must be false
        if (s1.length() != s2.length()) {
            return false;
        }
        //sort the strings then compare linearly
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
        //the sort may cause this to be O(nlogn) time
    }

    public static void main(String[] args) {
        System.out.println(checkPermutationOne("", ""));
        System.out.println(checkPermutationOne("a", "a"));
        System.out.println(checkPermutationOne("a", "b"));
        System.out.println(checkPermutationOne("abc", "bac"));
        System.out.println(checkPermutationOne("aabbc", "bcaba"));
        System.out.println(checkPermutationOne("abc", "ab"));
        System.out.println(checkPermutationTwo("", ""));
        System.out.println(checkPermutationTwo("a", "a"));
        System.out.println(checkPermutationTwo("a", "b"));
        System.out.println(checkPermutationTwo("abc", "bac"));
        System.out.println(checkPermutationTwo("aabbc", "bcaba"));
        System.out.println(checkPermutationTwo("abc", "ab"));

    }
}
