package Common;

import java.util.ArrayList;

public class CommonArray {

    public ArrayList<Integer> generateRandomArray(int num) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int tmp = (int) (Math.random() * 100);
            list.add(tmp);
        }
        return list;
    }

    public void printArray(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (i != array.size() - 1) {
                System.out.print(array.get(i) + " ");
            } else {
                System.out.println(array.get(i));
            }
        }
    }

}
