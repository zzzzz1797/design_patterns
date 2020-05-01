package strategy;

import java.util.Comparator;

/**
 * @author z
 * @date 2020-05-01 00:44
 */
public class NewSorter<T> {

    public void sorter(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = comparator.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, minPos, i);
        }

    }

    public void swap(T[] arr, int index1, int index2) {
        T tmpElement = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmpElement;
    }
}
