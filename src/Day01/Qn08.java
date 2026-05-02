package Day01;

import java.util.Scanner;

//Prime number
public class Qn08 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Check_prime(n);


    }
    public static void Check_prime(int n){
       int count=0;
        if (n<=1){
            System.out.println("Not Prime");
            return;
        }
        for (int i=2; i<n; i++){
            if (n%i==0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
