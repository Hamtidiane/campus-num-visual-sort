package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class HeapSort implements SortAlgorithm {
    @Override
    public void sort(ObservableArray array) {
        int n = array.getLength();

        // Construire le tas (réorganiser le tableau)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extraire les éléments un par un du tas
        for (int i = n - 1; i > 0; i--) {
            // Déplacer la racine actuelle à la fin

            array.swap(0, i);

            // Appeler heapify sur le tas réduit
            heapify(array, i, 0);
        }

        // Copier les éléments triés dans l'ObservableArray
    }



    // Méthode heapify
    private void heapify(ObservableArray array, int n, int i) {
        int largest = i; // Racine initiale
        int l = 2 * i + 1; // Index du fils gauche
        int r = 2 * i + 2; // Index du fils droit

        // Si le fils gauche est plus grand que la racine
        if (l < n && array.get(l) > array.get(largest)) {
            largest = l;
        }

        // Si le fils droit est plus grand que le plus grand élément actuel
        if (r < n && array.get(r) > array.get(largest)) {
            largest = r;
        }

        // Si le plus grand n'est pas la racine
        if (largest != i) {
            array.swap(i, largest);

            // Récurser sur le sous-arbre affecté
            heapify(array, n, largest);
        }
    }
}
