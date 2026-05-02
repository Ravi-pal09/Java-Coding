package Day02;

import java.util.Scanner;

// Armstrong number
public class Qn01 {

     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkArmstrong(n);
    }

    public static void checkArmstrong(int n) {

        int original = n;
        int temp = n;
        int count = 0;
        int sum = 0;

        // count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        temp = n;

        // calculate sum
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}