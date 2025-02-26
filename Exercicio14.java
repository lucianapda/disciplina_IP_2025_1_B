import java.util.Scanner;

public class Exercicio14 {

    //Análise:
    //Entradas:
    //Saídas:
    //Processo:
    //Algoritmo:
    //Fluxograma

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor em R$: ");
        int valor = teclado.nextInt();

        //Processo da divisão....
        int qntNotas100 = valor / 100;
        valor = valor % 100;
        int qntNotas50 = valor / 50;
        valor = valor % 50;
        int qntNotas20 = valor / 20;
        valor = valor % 20;
        int qntNotas10 = valor / 10;
        valor = valor % 10;
        int qntNotas5 = valor / 5;
        valor = valor % 5;
        int qntNotas2 = valor / 2;
        int qntNotas1 = valor % 2;

        System.out.println("Notas de R$100,00: " + 
        qntNotas100 + "\nNotas de R$50,00: " +
        qntNotas50 + "\nNotas de R$20,00: " +
        qntNotas20 + "\nNotas de R$10,00: " +
        qntNotas10 + "\nNotas de R$5,00: " +
        qntNotas5 + "\nNotas de R$2,00: " +
        qntNotas2 + "\nNotas de R$1,00: " +
        qntNotas1);

        teclado.close();
    }
}
