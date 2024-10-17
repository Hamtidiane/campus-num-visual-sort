package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class MergeSort implements SortAlgorithm {
    @Override
    public void sort(ObservableArray array) {
                /*if (array.getLength() > 1) {
                    int middle = array.getLength() / 2;

                    // Diviser le tableau en deux sous-tableaux
                    ObservableArray left = array.slice(0, middle);
                    ObservableArray right = array.slice(middle, array.getLength());

                    // Trier récursivement chaque moitié
                    this.sort(left);
                    this.sort(right);

                }
            }

            private void merge(ObservableArray array, ObservableArray left, ObservableArray right) {
                int i = 0, j = 0, k = 0;

                // Fusionner les tableaux left et right dans array
                while (i < left.getLength() && j < right.getLength()) {
                    if (left.get(i) <= right.get(j)) {
                        array.set(k++, left.get(i++));
                    } else {
                        array.set(k++, right.get(j++));
                    }
                }

                // Ajouter les éléments restants de left
                while (i < left.getLength()) {
                    array.set(k++, left.get(i++));
                }

                // Ajouter les éléments restants de right
                while (j < right.getLength()) {
                    array.set(k++, right.get(j++));
                }
            }*/
        }
}



