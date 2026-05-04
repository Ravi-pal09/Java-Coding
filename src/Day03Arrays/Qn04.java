package Day03Arrays;
//Find Second Smallest Element in an Array
import java.util.*;
public class Qn04 {
    static void main(String[] args) {
        int arr[]={12,3,4,88,5,23};
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;

        for (int i=0; i<arr.length; i++){
            if (arr[i]<min){
                smin=min;
                min=arr[i];

            }
            else if(arr[i]>min && arr[i]<smin){
                smin=arr[i];
            }
        }
        System.out.println(smin);

    }
}
