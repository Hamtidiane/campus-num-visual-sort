package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:32
 */
public class BubbleSort implements SortAlgorithm{
    @Override
    public void sort(ObservableArray array) {
        int n = array.getLength();
        boolean swapped = true;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array.get(i) > array.get(i + 1)){
                    array.swap(i, i+1);
                    swapped = true;

                }
            }
        }
        while(swapped);
    }

}