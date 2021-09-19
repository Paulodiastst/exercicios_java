import java.util.Locale;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.println("São multiplos");
        }
        else {
            System.out.println("Não são Multiplos");
        }


        sc.close();
    }
}