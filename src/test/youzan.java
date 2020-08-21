package test;

import java.util.ArrayList;
import java.util.List;

public class youzan {

    public static void main(String[] args) {

    }

    public int maxSumDivFive(int[] nums) {
        // write code here
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int res = 0;
        List<Integer> list = new ArrayList<>();
        process(nums, 0, res, list);
        for (Integer num : list) {
            if (num % 5 == 0) {
                res = num;
            }
        }
        return res;
    }

    public void process(int[] arr, int index, int ans, List<Integer> list) {
        if (index == arr.length) {
            list.add(ans);
        } else {
            process(arr, index + 1, ans, list);
            process(arr, index + 1, ans + arr[index], list);
        }
    }
}
