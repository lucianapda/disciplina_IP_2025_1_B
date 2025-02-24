import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nota 1: ");
        float n1 = teclado.nextFloat();

        System.out.println("Nota 2:");
        float n2 = teclado.nextFloat();

        System.out.print("Nota 3: ");
        float n3 = teclado.nextFloat();

        System.out.print("Nome: ");
        String nome = teclado.next();
        
        float media = (n1 + n2 + n3) / 3;

        System.out.println(nome);
        System.out.println(media);
    }
}
