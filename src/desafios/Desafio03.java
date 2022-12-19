package desafios;

import java.io.IOException;
import java.util.Scanner;

public class Desafio03 {
    
    public static void main(String[] args) throws Exception {
    
        limparTela();

        Scanner sc = new Scanner(System.in);

        /* Leitura 1 - A quantidade de elementos do array N e o valor alvo K */
        String entrada1 = sc.nextLine();
        int N = Integer.parseInt(entrada1.split(" ")[0]);
        int K = Integer.parseInt(entrada1.split(" ")[1]);

        /* Leitura 2 - Os elementos do array */
        String entrada2 = sc.nextLine();

        /* Salvar cada elemento em um array de string */
        String[] arrayString = entrada2.split(" ");
        
        /* Declarando um array de inteiros */
        int[] arrayInteger = new int[N];

        /* Realizando o type cast de string para inteiro */
        for (int j = 0; j < arrayString.length; j++) {
            arrayInteger[j] = Integer.valueOf(arrayString[j]);
        }

        System.out.println( detectaNumeroPares(arrayInteger, K) );

    }

    public static int detectaNumeroPares(int arr[], int K){

        int qtdPares = 0;

        for (int i = 0; i < arr.length-1; i++) {        
            if ( Math.abs((arr[i+1] - arr[i])) == K ) {
                qtdPares++;
            }
        }

        return qtdPares;
    }

    public static void limparTela() throws InterruptedException, IOException{
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
