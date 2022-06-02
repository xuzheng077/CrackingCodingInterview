package ch1;

/**
 * @author Xu Zheng
 * @description
 */
public class Four_PalindromePermutation {
    //assume this is case-insensitive and only contains letters
    private static boolean palindromePermutation(String str) {
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) <= 'z' && Character.toLowerCase(str.charAt(i)) >='a'){
                arr[Character.toLowerCase(str.charAt(i))-97]++;
            }
        }
        boolean found = false;
        for (int i=0;i< arr.length;i++){
            if (arr[i]%2 == 1){
                if (found){
                    return false;
                }
                found = true;
            }
        }
        return true;
        //this is O(n) time
    }

    public static void main(String[] args) {
        System.out.println(palindromePermutation(""));
        System.out.println(palindromePermutation("a"));
        System.out.println(palindromePermutation("acto tac"));
        System.out.println(palindromePermutation("act atac"));
        System.out.println(palindromePermutation("act cat"));
    }

}
