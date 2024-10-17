package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 14:55
 */
public class InsertionSort  implements SortAlgorithm {
    @Override
    public void sort(ObservableArray array) {

        int i, min, j;
        int n = array.getLength();
        for (i = 0; i < n; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                if (array.get(min) > array.get(j)) {
                    min = j;
                }
            }
            if (min != i) {
                array.swap(i, min);
            }
        }
    }
}