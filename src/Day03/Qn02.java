package Day03;

import java.util.Scanner;

//Lowest Common Multiple (LCM)
public class Qn02 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();

        LCM(a,b);
    }
    public static void LCM(int a, int b){
        int lcm=a*b;

        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int hcf=a;

        System.out.println(lcm/a);
    }
}
