package Day03Arrays;

import java.util.Scanner;

//Find Smallest Element in an Array
public class Qn02 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];

        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        Smallest_Element(arr);
    }
    public static void Smallest_Element(int arr[]){
        int min=arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
