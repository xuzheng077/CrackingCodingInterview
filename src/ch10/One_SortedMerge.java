package ch10;

/**
 * @author Xu Zheng
 * @description
 */
public class One_SortedMerge {
    //lastA is the index of last element in A
    //lastB is the index of last element in B
    void merge(int[] A, int[] B, int lastA, int lastB) {
        int lastIndexMerged = lastA + lastB + 1;
        int i, m, n;
        for (i = lastIndexMerged, m = lastA, n = lastB; m >= 0 && n >= 0; i--) {
            if (A[m] >= B[n]) {
                A[i] = A[m];
                m--;
            } else {
                A[i] = B[n];
                n--;
            }
        }
        if (m<0){
            for (int j = n; j >= 0 ; j--) {
                A[i] = B[j];
            }
        }
    }
}
