package ch1;

/**
 * @author Xu Zheng
 * @description replace a space with "%20"
 */
public class Three_URLify {
    private static String replaceSpacesOne(String str, int trueLength) {
        //a common approach is working from end to start reversely
        //we can assume the total space of the string is enough
        char[] arr = str.toCharArray();
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (arr[i] == ' ') {
                spaceCount++;
            }
        }
        int p = trueLength + spaceCount * 2;
        for (int i = trueLength - 1; i >= 0; i--) {
            if (arr[i] == ' ') {
                arr[--p] = '0';
                arr[--p] = '2';
                arr[--p] = '%';
            } else {
                arr[--p] = arr[i];
            }
        }
        return String.valueOf(arr);
    }

    private static String replaceSpacesTwo(String str, int trueLength) {
        //let's try working from start to end using another array
        //we can assume the total space of the string is enough
        char[] arr = str.toCharArray();
        char[] arr1 = new char[arr.length];
        for (int i = 0, j = 0; i < trueLength; i++, j++) {
            if (arr[i] == ' ') {
                arr1[j++] = '%';
                arr1[j++] = '2';
                arr1[j] = '0';
            } else {
                arr1[j] = arr[i];
            }
        }
        return String.valueOf(arr1);
    }

    public static void main(String[] args) {
        System.out.println(replaceSpacesOne("hello", 5));
        System.out.println(replaceSpacesOne("hello world  ", 11));
        System.out.println(replaceSpacesOne("hello world bob    ", 15));
        System.out.println(replaceSpacesTwo("hello", 5));
        System.out.println(replaceSpacesTwo("hello world  ", 11));
        System.out.println(replaceSpacesTwo("hello world bob    ", 15));
    }
}
