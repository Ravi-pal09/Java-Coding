package Day01;

import java.util.Scanner;

//Even or Odd number
public class Qn04 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Check_nun(num);

    }
    public static  void Check_nun(int num){
        if (num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

}
