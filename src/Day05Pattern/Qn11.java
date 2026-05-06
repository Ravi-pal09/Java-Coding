package Day05Pattern;

public class Qn11 {
    static void main(String[] args) {
        int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if (i%2==1){
                    System.out.print(j+" ");
                } else if (i%2==0) {
                    System.out.print((char)+(j+64)+" ");
                }
            }
            System.out.println();
        }
    }
}
