import java.util.Locale;
import java.util.Scanner;

public class HoraInicialHoraFinal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInical = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duraçao;
        if (horaInical < horaFinal) {
            duraçao = horaFinal - horaInical;
        }
        else {
            duraçao = 24 - horaInical + horaFinal;
        }

        System.out.println("O jogo durou " + duraçao + " hora(s)");

        sc.close();
    }
}