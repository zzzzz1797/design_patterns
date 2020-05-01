package strategy;

import java.util.Comparator;

/**
 * @author z
 * @date 2020-05-01 00:15
 */
public class Sorter {

    /**
     * @param arr 这样写虽然，可以输入不同的参数使用同一方法进行排序，但是真正的compareTo是事先写好的，这样比较呆板，扩展性不强，不算是真正的策略模式。
     */
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
