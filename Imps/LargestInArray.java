//write a program to find largest element in array?
public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 34};
        int max = arr[0];

        for (int num : arr) {
            if (num > max)
                max = num;
        }

        System.out.println("Largest element: " + max);
    }
}
