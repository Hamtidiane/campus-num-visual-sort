package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class QuickSort implements SortAlgorithm {
    @Override
    public void sort(ObservableArray array) {
        // Vérifier si le tableau n'est pas nul ou vide avant de trier
        if (array != null && array.getLength() > 1) {
            // Appeler la méthode quicksort avec les indices bas et haut
            quicksort(array, 0, array.getLength() - 1);
        }
    }

    // Méthode de tri rapide (quicksort) avec les indices bas et haut
    private void quicksort(ObservableArray array, int low, int high) {
        if (low < high) {
            // Trouver l'index de partition
            int pivotIndex = partition(array, low, high);

            // Trier les sous-tableaux récursivement
            quicksort(array, low, pivotIndex - 1); // Tri du sous-tableau gauche
            quicksort(array, pivotIndex + 1, high); // Tri du sous-tableau droit
        }
    }

    // Méthode pour partitionner le tableau
    private int partition(ObservableArray array, int low, int high) {
        int pivot = array.get(high); // Choisir le dernier élément comme pivot
        int i = low - 1; // Index du plus grand élément plus petit que le pivot

        for (int j = low; j < high; j++) {
            // Si l'élément courant est plus petit ou égal au pivot
            if (array.get(j) <= pivot) {
                i++;
                array.swap(i, j); // Échanger array[i] et array[j]
            }
        }

        // Échanger le pivot avec l'élément suivant de la partition
        array.swap(i + 1, high);
        System.out.println(array);

        return i + 1; // Retourner l'index du pivot
    }
}
