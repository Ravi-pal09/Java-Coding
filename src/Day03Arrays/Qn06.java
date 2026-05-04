package Day03Arrays;

import java.util.Scanner;

//Reverse an Array
public class Qn06 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];

        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        Revese(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void Revese(int arr[]){
        int first=arr[0];
        int last=arr.length-1;

        while(first<last){
            int temp=first;
            first=last;
            last=temp;
            first++;
            last--;
        }
        //System.out.println();
    }

}
