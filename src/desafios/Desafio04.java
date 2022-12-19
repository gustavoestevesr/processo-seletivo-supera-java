package desafios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio04 {

    public static void main(String[] args) throws Exception {

        limparTela();

        Scanner sc = new Scanner(System.in);

        /* Leitura da quantidade de casos de teste */
        int N = sc.nextInt();

        List<String> casosTeste = new ArrayList<>();

        /* Looping de leitura de casos de teste */
        for (int i = 0; i <= N; i++) {
            casosTeste.add(sc.nextLine());
        }

        /* Looping de saída de casos de teste */
        for (int j = 0; j <= N; j++) {
            decifrador(casosTeste.get(j));
        }

    }

    public static void cifrador(String frase) {
        /* Calculando o meio da frase */
        int indiceMeio = frase.length() / 2;

        /* Separando o lado esquerdo da direita */
        String esquerda = frase.substring(0, indiceMeio);
        // System.out.println(esquerda);
        for (int i = esquerda.length() - 1; i >= 0; i--) {
            System.out.print(esquerda.charAt(i));
        }

        String direita = frase.substring(indiceMeio, frase.length());
        // System.out.println(direita);
        for (int i = direita.length() - 1; i >= 0; i--) {
            System.out.print(direita.charAt(i));
        }

        System.out.println();
    }

    public static void decifrador(String frase) {
        /* Calculando o meio da frase */
        int indiceMeio = frase.length() / 2;

        /* Separando o lado esquerdo da direita */
        String esquerda = frase.substring(0, indiceMeio);
        // System.out.println(esquerda);
        for (int i = esquerda.length() - 1; i >= 0; i--) {
            System.out.print(esquerda.charAt(i));
        }

        String direita = frase.substring(indiceMeio, frase.length());
        // System.out.println(direita);
        for (int i = direita.length() - 1; i >= 0; i--) {
            System.out.print(direita.charAt(i));
        }

        System.out.println();
    }

    public static void limparTela() throws InterruptedException, IOException {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
