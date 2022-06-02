package ch10;

/**
 * @author Xu Zheng
 * @description
 */
//????
public class Three_SearchInRotatedArray {
    //5 5 5 5 5 1 2 3 5
    //x is the number to be found
    int search(int[] arr, int left, int right, int x) {
        int middle = (left + right) / 2;
        if (arr[middle] == x) {
            return middle;
        }
        if (right < left) {
            return -1;
        }
        if (arr[left] < arr[middle]) {
            //left half is sorted
            if (x < arr[middle] && x >= left) {
                return search(arr, left, middle - 1, x);
            } else {
                return search(arr, middle + 1, right, x);
            }
        } else if (arr[middle] < arr[left]) {
            if (x > arr[middle] && x <= right) {
                return search(arr, middle + 1, right, x);
            } else {
                return search(arr, left, middle - 1, x);
            }
        } else if (arr[middle] == arr[left]) {
            if (arr[middle] != arr[right]) {
                return search(arr, middle + 1, right, x);
            } else {
                int result = search(arr, left, middle - 1, x);
                if (result == -1) {
                    return search(arr, middle + 1, right, x);
                }else {
                    return result;
                }
            }
        }
        return -1;
    }
}
