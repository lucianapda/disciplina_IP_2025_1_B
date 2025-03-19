import java.util.Scanner;

public class Exemplo {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int numero = s.nextInt();

        if (numero < 5) {
            System.out.println("Numero menor que 5");
        } else if (numero < 10) {
            System.out.println("Numero menor que 10");
        } else {
            System.out.println("É um número grande");
        }
        System.out.println("Fim do código");

        boolean achou = s.nextBoolean();
        if (achou) { //==true
            System.out.println("Sim, achou");
        } else { //== false
            System.out.println("Não, não achou");
        }

        s.close();
    }

}
