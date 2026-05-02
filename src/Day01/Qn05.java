package Day01;

import java.util.Scanner;

//Sum of First N Natural numbers
public class Qn05 {
    static void main(String[] args) {
        int n=5;
       sumofnum(n);

    }
    public static  void sumofnum(int n){
        int sum=0;
        for (int i=1; i<5; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
