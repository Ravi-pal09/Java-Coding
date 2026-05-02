package Day01;
//Sum of digits of a number
public class Qn09 {
    static void main(String[] args) {
        int num = 12345;
        number_sum(num);
    }
    public static void number_sum(int num){
        int sum=0;
        while(num>0){
              int digit=num%10;
              sum+=digit;
              num/=10;
          }
        System.out.println(sum);
    }
}
