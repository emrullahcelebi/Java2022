package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 3, 6, 2, 5, 1, 4, 2, 3, 1, 2};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);//[1, 2, 4, 3, 6, 5]

        Integer tekrarsizArray[]=list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(tekrarsizArray));//[1, 2, 4, 3, 6, 5]
    }
}
