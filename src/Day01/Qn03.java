package Day01;

import java.util.*;

//Positive or Negative number
public class Qn03 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         check(n);

    }
    public static void check(int n) {
        if (n > 0) {
            System.out.println("Postive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zeero");
        }
    }
}
