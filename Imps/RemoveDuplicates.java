//write a program to remove duplicates from array?
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 2, 3, 8, 9};
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array without duplicates: " + set);
    }
}
