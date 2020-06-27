package Common;

import java.util.ArrayList;

public class CommonArray {

    public ArrayList<Integer> generateRandomArrayList(int num) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int tmp = (int) (Math.random() * 100);
            list.add(tmp);
        }
        return list;
    }

    public int[] generateRandomArray(int num) {

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            int tmp = (int) (Math.random() * 100);
            arr[i] = tmp;
        }
        return arr;
    }

    public void printArrayList(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (i != array.size() - 1) {
                System.out.print(array.get(i) + " ");
            } else {
                System.out.println(array.get(i));
            }
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + " ");
            } else {
                System.out.println(array[i]);
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public void selectionSort(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    public void insertSort(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public void guluSort(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
}