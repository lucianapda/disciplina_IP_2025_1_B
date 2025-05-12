
/*Descreva um algoritmo que leia 10 números inteiros 
e os coloque em um vetor de 10 posições do tipo
inteiro. Escreva na ordem inversa em que foram
lidos. Faça um método para ler e outro para
escrever. */

import java.util.Scanner;

public class Unid6Exe01 {

    public Unid6Exe01() {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[5];

        ler(numeros, s);
        escrever(numeros);

        s.close();
    }

    public static void main(String[] args) {
        new Unid6Exe01();
    }

    private void escrever(int numeros[]) {
        //for (int i = 9; i >= 0; i--) {
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
    private void ler(int numeros[], Scanner leitor) {
        //for (int indice = 0; indice < 10; indice++){
        for (int indice = 0; indice < numeros.length; indice++){
            System.out.print("Digite o número ["+ indice +"]: ");
            numeros[indice] = leitor.nextInt();
        }
    }
}
