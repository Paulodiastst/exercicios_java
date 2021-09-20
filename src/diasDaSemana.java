import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

public class diasDaSemana
{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int x = sc.nextInt();
        String dia = switch (x) {
            case 1 -> "domingo";
            case 2 -> "segunda";
            case 3 -> "terca";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            case 7 -> "sábado";
            default -> "valor invalido";
        };

        out.println("Dia da semana: " + dia);

        sc.close();
    }
}
