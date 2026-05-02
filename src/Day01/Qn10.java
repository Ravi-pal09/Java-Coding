package Day01;
//Reverse of a number
public class Qn10 {
    static void main(String[] args) {
        int num=12345;
        reverse(num);

    }
    public static void reverse(int num){
        int rev=0;
        while(num!=0){
           int digit=num%10;
           rev=rev*10+digit;
           num=num/10;
        }
        System.out.println(rev);
    }
}
