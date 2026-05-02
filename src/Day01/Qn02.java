package Day01;

import java.util.Scanner;

//Arstrong Number
public class Qn02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(is_Armstrong_number(n));
    }
    public static boolean is_Armstrong_number(int n){
        int d=countofdigti(n);
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=(int) (sum+Math.pow(rem,d));
            n/=10;

        }
        if (sum==n){
            return true;
        }
        else{
            return false;
        }
    }
        public static int countofdigti(int n){
            int count=0;
            while(n>0){
                count++;
                n/=10;
            }
            return count;
        }

}
