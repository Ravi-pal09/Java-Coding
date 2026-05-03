package Day03;

import java.util.Scanner;

//Greatest Common Divisor
public class Qn03 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        G_C_D(a,b);
    }
    public static void G_C_D(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;

        }
        System.out.println(a);
    }

}
