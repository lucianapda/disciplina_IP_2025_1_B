import java.util.Scanner;

public class ExemploString {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String letra = s.next();
        char primeiraLetra = letra.charAt(0);

        String maiusculo = letra.toUpperCase();
        String minusculo = letra.toLowerCase();

        char cMaiusculo = letra.toUpperCase().charAt(0);

        int indice = letra.indexOf("a");

        System.out.println(indice);
        System.out.println(primeiraLetra);
        System.out.println(maiusculo);
        System.out.println(minusculo);


        s.close();
    }

}
