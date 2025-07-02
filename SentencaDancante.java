
import java.util.*;

public class SentencaDancante {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String frase = sc.nextLine();
            char fraseSeparada[] = transformarEmDancante(frase);
            String FraseDancante = new String(fraseSeparada);
            System.out.println(FraseDancante);
        }
    }

    public static char[] transformarEmDancante(String frase) {
        char fraseSeparada[] = frase.toCharArray();
        int posicao = 0;

        for (int i = 0; i < fraseSeparada.length; i++) {
            if (fraseSeparada[i] != ' ') {
                if (posicao % 2 == 0) fraseSeparada[i] = Character.toUpperCase(fraseSeparada[i]); 
                else fraseSeparada[i] = Character.toLowerCase(fraseSeparada[i]);
                posicao++;
            }
        }
        return fraseSeparada;
    }
}
