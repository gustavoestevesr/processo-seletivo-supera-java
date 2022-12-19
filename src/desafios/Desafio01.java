package desafios;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Desafio01 {

    public static void main(String[] args) throws Exception {
        
        limparTela();

        Scanner sc = new Scanner(System.in);

        // capturando a quantidade de numeros total de leitura
        int quantidadeNumeros = sc.nextInt(); 

        // lista de numeros pares e impares
        List<Integer> numerosPares = new ArrayList<>(); 
        List<Integer> numerosImpares = new ArrayList<>(); 

        // variável temporária para ler o numero do usuário
        int numero;
        
        int contador = 0;
        while (contador < quantidadeNumeros) {

            numero = sc.nextInt();

            /* verificar se é par e salvar na lista de numeros pares */
            if (verificaSeNumeroEPar(numero)) { 
                numerosPares.add(numero);
            } /* verificar se é impar e salvar na lista de numeros impares */
            else { 
                numerosImpares.add(numero);
            }
    
            contador++;
        }

        /* apresentar os numeros pares em ordem crescente */
        numerosPares = ordenarCrescente(numerosPares);
        for (Integer integer : numerosPares) { 
            System.out.println(integer);
        }

        /* apresentar os numeros impares em ordem decrescente */
        numerosImpares = ordenarDecrescente(numerosImpares);
        for (Integer integer : numerosImpares) { 
            System.out.println(integer);
        }

    }

    public static void limparTela() throws InterruptedException, IOException{
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static boolean verificaSeNumeroEPar(int numero){
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static List<Integer> ordenarCrescente( List<Integer> numerosPares ){
        return numerosPares.stream()
        .sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());
    }

    public static List<Integer> ordenarDecrescente( List<Integer> numerosImpares ){
        return numerosImpares.stream()
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
    }

}
