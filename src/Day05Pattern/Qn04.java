package Day05Pattern;

public class Qn04 {
    static void main(String[] args) {
        int n=4;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
