
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor R$: ");
        float valorReais = teclado.nextFloat();

        int valorInteiro = (int)(valorReais * 100);
        int cedulas = valorInteiro / 100;
        int moedas = valorInteiro % 100;

        //Processo das cédulas:
        int nota100 = cedulas / 100;
        cedulas = cedulas % 100;
        int nota50 = cedulas / 50;
        cedulas = cedulas % 50;
        int nota20 = cedulas / 20;
        cedulas = cedulas % 20;
        int nota10 = cedulas / 10;
        cedulas = cedulas % 10;
        int nota5 = cedulas / 5;
        cedulas = cedulas % 5;
        int nota2 = cedulas / 2;
        
        //Processo das moedas:
        int moeda1 = cedulas % 2;

        int moeda50 = moedas / 50;
        moedas = moedas % 50;
        int moedas25 = moedas / 25;
        moedas = moedas % 25;
        int moedas10 = moedas / 10;
        moedas = moedas % 10;
        int moedas5 = moedas / 5;
        int moedas1c = moedas % 5;

        System.out.println("Quantidade de notas:" +
        "\nR$100,00 " + nota100 +"\nR$50,00 " + nota50 +
        "\nR$20,00 " + nota20 + "\nR$10,00 " + nota10 +
        "\nR$5,00 " + nota5 + "\nR$2,00 " + nota2 +
        "\n1,00 " + moeda1 + "\n0,50 " + moeda50 + 
        "\n0,25 " + moedas25 + "\n0,10 " + moedas10 +
        "\n0,05 " + moedas5 + "\n0,01 " + moedas1c);

        teclado.close();
    }
}
