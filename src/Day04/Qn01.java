package Day04;

import java.util.Arrays;

//Sort first half in ascending order and second half in descending
public class Qn01 {
    static void main(String[] args) {
        int arr[]={5,2,8,1,9,3};
        int n=arr.length;

        int mid=n/2;
        Arrays.sort(arr);
        int i = mid, j = n - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }


        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
