package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class SelectionSort implements SortAlgorithm{
    @Override
    public void sort(ObservableArray array) {
        int i, min, j;
        for (i = 0; i < array.getLength() - 1; i++) {
            min = i;
            for (j = i + 1; j < array.getLength(); j++) {
                if (array.get(min) > array.get(j)) {
                    min = j;
                }
            }
            array.swap(min, i);
        }
    }
}
