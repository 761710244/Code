package model;

public class BloomFilter {

    public static int[] generateBitmap(int len) {
        /**
         * 0 - 320 bit
         * arr[0]   0 - 31
         * arr[1]   32 - 63
         * arr[2]   64 - 95
         */
        int[] arr = new int[len];

        return arr;
    }

    public static int getIndexStatus(int[] arr, int i) {

        int numIndex = i / 32;
        int bitIndex = i % 32;

        /**
         * 取出第i位的状态
         */
        int status = (arr[numIndex] >> bitIndex) & 1;
        return status;
    }

    public static void setIndex1(int[] arr, int i) {

        int numIndex = i / 32;
        int bitIndex = i % 32;

        /**
         * 将第i位的状态置为1
         */
        arr[numIndex] = arr[numIndex] | (1 << bitIndex);
    }

    public static void setIndex0(int[] arr, int i) {

        int numIndex = i / 32;
        int bitIndex = i % 32;

        /**
         * 将第i位的状态置为1
         */
        arr[numIndex] = arr[numIndex] & (~(1 << bitIndex));
    }

}
