package Day01;

import java.util.Scanner;

//Palindrome number
public class Qn11 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        check_palindrome(n);

    }
    public  static void check_palindrome(int n){
        int rev=0;
        int original=n;

        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;

        }
        if (original==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
