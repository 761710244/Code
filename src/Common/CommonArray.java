package Common;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CommonArray {

    public static ArrayList<Integer> generateRandomArrayList(int num) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int tmp = (int) (Math.random() * 100);
            list.add(tmp);
        }
        return list;
    }

    public static int[] generateRandomArray(int num) {

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            int tmp = (int) (Math.random() * 100);
            arr[i] = tmp;
        }
        return arr;
    }

    public static void printArrayList(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (i != array.size() - 1) {
                System.out.print(array.get(i) + " ");
            } else {
                System.out.println(array.get(i));
            }
        }
    }

    public static void printArrayLists(ArrayList<ArrayList<Integer>> array) {
        if (array == null) {
            return;
        }
        for (int i = 0; i < array.size(); i++) {
            printArrayList(array.get(i));
            System.out.println("");
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + " ");
            } else {
                System.out.println(array[i]);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    /**
     * 当两个数值不一样时，可使用，否则不行
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swap1(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    /**
     * 测试选择排序
     *
     * @param arr
     */
    public static void selectionSort(int[] arr) {
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

    /**
     * 测试插入排序
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
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

    /**
     * 测试冒泡排序
     *
     * @param arr
     */
    public static void guluSort(int[] arr) {
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

    /**
     * 测试归并排序
     *
     * @param arr
     */
    public static void mergeSort(int[] arr) {
        if (arr == null) {
            return;
        }
        mergeProcess(arr, 0, arr.length - 1);
    }

    private static void mergeProcess(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = l + (r - l) / 2;
        mergeProcess(arr, l, mid);
        mergeProcess(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = m + 1;
        while (p1 <= m && p2 <= r) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= m) {
            help[i++] = arr[p1++];
        }
        while (p2 <= r) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }
    }

    /**
     * 常规快排
     *
     * @param arr
     * @param left
     * @param right
     */
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        int base = arr[left];
        while (i < j) {
            while (arr[j] >= base && i < j) {
                j--;
            }
            while (arr[i] <= base && i < j) {
                i++;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        arr[left] = arr[i];
        arr[i] = base;
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }

    /**
     * 将数组分为小于区和大于区
     *
     * @param arr
     * @param number
     */
    public static void smallBig(int[] arr, int number) {
        if (arr == null) {
            return;
        }
        int small = -1;
        for (int cur = 0; cur < arr.length; cur++) {
            if (arr[cur] <= number) {
                swap(arr, cur, ++small);
            }
        }
    }

    /**
     * 将数组分为小于等于大于三部分
     *
     * @param arr
     * @param num
     */
    public static void smallEqualBig(int[] arr, int num) {
        if (arr == null) {
            return;
        }
        int small = -1;
        int big = arr.length;
        int cur = 0;
        while (cur < big) {
            if (arr[cur] < num) {
                swap(arr, cur++, ++small);
            } else if (cur == num) {
                cur++;
            } else {
                swap(arr, cur, --big);
            }
        }
    }

    /**
     * 堆排序
     *
     * @param arr
     */
    public static void heapSort(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int size = arr.length;
        while (size > 0) {
            swap(arr, 0, --size);
            heapIfy(arr, 0, size);
        }
    }

    /**
     * 建堆，向上浮
     *
     * @param arr
     * @param index
     */
    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    /**
     * 向下沉
     *
     * @param arr
     * @param index
     * @param size
     */
    public static void heapIfy(int[] arr, int index, int size) {
        int left = index * 2 + 1;
        while (left < size) {
            int largest = left + 1 < size && arr[left] < arr[left + 1] ? left + 1 : left;
            largest = arr[index] < arr[largest] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, index, largest);
            index = largest;
            left = index * 2 + 1;
        }
    }

    public static void priorityQueueSort(int[] arr) {
        if (arr == null) {
            return;
        }
        Queue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }
        int index = 0;
        while (!heap.isEmpty()) {
            arr[index++] = heap.poll();
        }
    }

    public static void main(String[] args) {

        System.out.println("测试选择排序:");
        int[] arr = generateRandomArray(10);
        printArray(arr);
        selectionSort(arr);
        printArray(arr);

        System.out.println("\n测试插入排序:");
        arr = generateRandomArray(10);
        printArray(arr);
        insertSort(arr);
        printArray(arr);

        System.out.println("\n测试冒泡排序:");
        arr = generateRandomArray(10);
        printArray(arr);
        guluSort(arr);
        printArray(arr);

        System.out.println("\n测试归并排序:");
        arr = generateRandomArray(10);
        printArray(arr);
        mergeSort(arr);
        printArray(arr);

        System.out.println("\n测试常规快排:");
        arr = generateRandomArray(10);
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);

        System.out.println("\n将数组分为小于和大于区:");
        arr = generateRandomArray(10);
        printArray(arr);
        smallBig(arr, 20);
        printArray(arr);

        System.out.println("\n将数组分为小于等于和大于三部分:");
        arr = generateRandomArray(10);
        printArray(arr);
        int num = arr[3];
        System.out.println(num);
        smallEqualBig(arr, num);
        printArray(arr);

        System.out.println("\n堆排序1:");
        arr = generateRandomArray(10);
        printArray(arr);
        heapSort(arr);
        printArray(arr);

        System.out.println("\n堆排序2:");
        arr = generateRandomArray(10);
        printArray(arr);
        priorityQueueSort(arr);
        printArray(arr);
    }
}