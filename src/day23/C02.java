package day23;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C02 {
    public static void main(String[] args) {

        int arr[]={2,3,4,2,3,5,7,5,4,7,9,2,4,1,7};

        int tekrarsizArray[]=tekrarlariSil(arr);
        System.out.println(Arrays.toString(tekrarsizArray));
    }

    public static int[] tekrarlariSil(int[] arr) {
        Set<Integer> set1=new HashSet<>();

        for (Integer each:arr) {
            set1.add(each);

        }
        System.out.println(set1);

        int tekrarsizArray[]=new int[set1.size()];

int index=0;
        for (int each: set1) {
            tekrarsizArray[index]=each;
            index++;
        }
        return tekrarsizArray;
    }
}
