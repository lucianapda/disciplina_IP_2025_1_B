import java.util.Scanner;

public class Exe20 {

    /* 
     * Entrada: numeroDobras
     * Saída: quantidadeQuadrados
     * Processo: numeroDobras * numeroDobras
     * Testes: 
     * 2 | 4
     * 4 | 16
     * 
     * Fluxograma:
     * 
     * O -> ler numeroDobras -> 
     * quantidadeQuadrado = numeroDobras * numeroDobras
     * -> escrever quantidadeQuadrado -> O
     * 
    */

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a quantidade de dobras (par): ");
        int quantidadeDobras = s.nextInt();

        int quantidadeQuadrados = (int) Math.pow(quantidadeDobras,2);

        System.out.println("Quantidade de quadrados = " + 
                            quantidadeQuadrados);
        s.close();
    }

}
