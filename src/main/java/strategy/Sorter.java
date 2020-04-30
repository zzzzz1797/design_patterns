package strategy;

/**
 * @author z
 * @date 2020-05-01 00:15
 */
public class Sorter {
    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, minPos, i);
        }

    }


    public static void swap(Comparable[] arr, int index1, int index2) {
        Comparable tmpElement = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmpElement;
    }
}
