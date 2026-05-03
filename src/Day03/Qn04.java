package Day03;

import java.util.Scanner;

//Binary to Decimal to conversion
public class Qn04 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Binary= sc.nextInt();

        Bi_De(Binary);

    }
    public static void Bi_De(int Binary){
        int power=0;
        int decimal=0;

        while(Binary!=0){
            int digit=Binary%10;
            decimal+=decimal+Math.pow(2,power);
            Binary/=10;
            power++;
        }
        System.out.println(decimal);
    }
}
