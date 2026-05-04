package Day03Arrays;

import java.util.Scanner;

//Find Largest element in an array
public class Qn01 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];


        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        Largest_number(arr);
    }
    public static void Largest_number(int arr[]){
        int max=arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println(max);
    }
}
