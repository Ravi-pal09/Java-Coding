package Day05Pattern;

import java.util.Scanner;

public class Qn03 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1; i<=n; i++){
           for (int j=1; j<=n; j++){
               System.out.print(j+" ");
           }
            System.out.println();

        }

    }
}
