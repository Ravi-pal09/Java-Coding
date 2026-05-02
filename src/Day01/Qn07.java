package Day01;
//Leap year or not
public class Qn07 {
    static void main(String[] args) {
        int year=2022;
        check_year(year);

    }
    public static void check_year(int year){
        if (year%400==0){
            System.out.println("Leap year");
        } else if (year %4==0 && year%100 !=0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Normal year");
        }
    }
}
