package Day03Arrays;

// Find smallest and largest element in array
public class Qn03 {

    public static void main(String[] args) {

        int arr[] = {12, 4, 5, 6, 7, 812, 453};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}