package Day04;
import java.util.*;
//Sort the elements of an array
public class Qn02 {
    static void main(String[] args) {
        int arr[] = {5, 2, 8, 1, 9};

        Arrays.sort(arr);   // ascending

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
