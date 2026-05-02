package Day01;

import java.util.Scanner;

//Sum of numbers in a given range
public class Qn06 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();

        System.out.println("Enter value of b");
        int b=sc.nextInt();

        number(a,b);


    }
    public static void number(int a, int b){
        int sum=0;
        for (int i=a; i<=b; i++){
            sum+=i;

        }
        System.out.println(sum);
    }
}
