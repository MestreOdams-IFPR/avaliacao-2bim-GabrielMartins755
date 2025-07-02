import java.util.*;

public class TesteForca {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()) {
            int candidatos[] = new int[sc.nextInt()];
            int k = sc.nextInt();
            for (int i = 0; i < candidatos.length; i++) {
                candidatos[i] = sc.nextInt();
            }

            selectionSort(candidatos);
            inverterVetor(candidatos);

            int soma = 0;
            for (int i = 0; i < k; i++) {
                soma += candidatos[i];
            }
            System.out.println(soma);
        }
    }

    public static void inverterVetor(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int menorIndice = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[menorIndice]) {
                    menorIndice = j;
                }
            }
            int k = array[menorIndice];
            array[menorIndice] = array[i];
            array[i] = k;
        }
    }
}
