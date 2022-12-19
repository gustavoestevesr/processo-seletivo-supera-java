package desafios;

import java.io.IOException;
import java.util.Scanner;

public class Desafio02 {
    
    public static void main(String[] args) throws Exception {
    
        limparTela();

        Scanner sc = new Scanner(System.in);

        double valorMonetario = sc.nextDouble(); // capturando o valor monetario

        calculaNotas(valorMonetario);        

    }

    public static void calculaNotas(double valorMonetario){

        int cemReais = 100;
        int cinquentaReais = 50;
        int vinteReais = 20;
        int dezReais = 10;
        int cincoReais = 5;
        int doisReais = 2;        

        int notasDeCem = 0;
        while (valorMonetario >= cemReais) {
            notasDeCem++;
            valorMonetario -= cemReais;
        }
        int notasDeCinquenta = 0;
        while (valorMonetario >= cinquentaReais) {
            notasDeCinquenta++;
            valorMonetario -= cinquentaReais;
        }
        int notasDeVinte = 0;
        while (valorMonetario >= vinteReais) {
            notasDeVinte++;
            valorMonetario -= vinteReais;
        }
        int notasDeDez = 0;
        while (valorMonetario >= dezReais) {
            notasDeDez++;
            valorMonetario -= dezReais;
        }
        int notasDeCinco = 0;
        while (valorMonetario >= cincoReais) {
            notasDeCinco++;
            valorMonetario -= cincoReais;
        }
        int notasDeDois = 0;
        while (valorMonetario >= doisReais) {
            notasDeDois++;
            valorMonetario -= doisReais;
        }
        
        apresentarNotas(notasDeCem, notasDeCinquenta, notasDeVinte, notasDeDez, notasDeCinco, notasDeDois);
        calculaMoedas(valorMonetario);
    }

    public static void apresentarNotas(int notasDeCem, int notasDeCinquenta, int notasDeVinte, int notasDeDez, int notasDeCinco, int notasDeDois){
        System.out.println("NOTAS");
        System.out.printf("%d \t nota(s) \t de \t R$ \t %s\n", notasDeCem, "100.00");
        System.out.printf("%d \t nota(s) \t de \t R$ \t %s\n", notasDeCinquenta, "50.00");
        System.out.printf("%d \t nota(s) \t de \t R$ \t %s\n", notasDeVinte, "20.00");
        System.out.printf("%d \t nota(s) \t de \t R$ \t %s\n", notasDeDez, "10.00");
        System.out.printf("%d \t nota(s) \t de \t R$ \t %s\n", notasDeCinco, "5.00");
        System.out.printf("%d \t nota(s) \t de \t R$ \t %s\n", notasDeDois, "2.00");
    }

    public static void calculaMoedas(double valorMonetario){

        int umReal = 1;
        double cinquentaCentavos = 0.50;
        double vinteCincoCentavos = 0.25;
        double dezCentavos = 0.10;
        double cincoCentavos = 0.05;    
        double umCentavo = 0.01;    

        int moedasDeUm = 0;
        while (valorMonetario >= umReal) {
            moedasDeUm++;
            valorMonetario -= umReal;
        }
        int moedasDeCinquenta = 0;
        while (valorMonetario >= cinquentaCentavos) {
            moedasDeCinquenta++;
            valorMonetario -= cinquentaCentavos;
        }
        int moedasDeVinteCinco = 0;
        while (valorMonetario >= vinteCincoCentavos) {
            moedasDeVinteCinco++;
            valorMonetario -= vinteCincoCentavos;
        }
        int moedasDeDez = 0;
        while (valorMonetario >= dezCentavos) {
            moedasDeDez++;
            valorMonetario -= dezCentavos;
        }
        int moedasDeCinco = 0;
        while (valorMonetario >= cincoCentavos) {
            moedasDeCinco++;
            valorMonetario -= cincoCentavos;
        }
        int moedasDeUmCentavo = 0;
        while (valorMonetario >= umCentavo) {
            moedasDeUmCentavo++;
            valorMonetario -= umCentavo;
        }
        
        apresentarMoedas(moedasDeUm, moedasDeCinquenta, moedasDeVinteCinco, moedasDeDez, moedasDeCinco, moedasDeCinco, moedasDeUmCentavo);
   
    }

    public static void apresentarMoedas(int moedasDeUmReal, int moedasDeCinquentaCentavos, int moedasDeVinteCincoCentavos, int moedasDeDezCentavos, int moedasDeCincoCentavos, int notasDeDoisCentavos, int moedasDeUmCentavo){
        System.out.println("MOEDAS");
        System.out.printf("%d \t moeda(s) \t de \t R$ \t %s\n", moedasDeUmReal, "1.00");
        System.out.printf("%d \t moeda(s) \t de \t R$ \t %s\n", moedasDeCinquentaCentavos, "0.50");
        System.out.printf("%d \t moeda(s) \t de \t R$ \t %s\n", moedasDeVinteCincoCentavos, "0.25");
        System.out.printf("%d \t moeda(s) \t de \t R$ \t %s\n", moedasDeDezCentavos, "0.10");
        System.out.printf("%d \t moeda(s) \t de \t R$ \t %s\n", moedasDeCincoCentavos, "0.05");        
        System.out.printf("%d \t moeda(s) \t de \t R$ \t %s\n", moedasDeUmCentavo, "0.01");
    }

    public static void limparTela() throws InterruptedException, IOException{
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
