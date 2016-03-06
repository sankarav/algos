package edu.ub.san.algos.goodrichbook.chap_3.arrays.insertionsort;

/**
 * Created by san on 3/1/16 for algos.
 */
public class InsertionSort {

    public void sort(int[] in) {
        for (int i = 1; i < in.length; i++) {
            int temp = in[i];
            int j = i;
            while (j > 0 && in[j-1] > temp) {
                in[j] = in[j-1];
                j--;
            }
            in[j] = temp;
        }
    }
}
