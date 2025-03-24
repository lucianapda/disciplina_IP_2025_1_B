import java.util.Scanner;

public class Unid4Exe06 {
    /*Entrada: sexoC
     * Saída: sexoString
     * Processo: ler o sexo abreviado, verificar 
     * a opção (M, F, I) e imprimir a respostas
     * se for outra informação imprimir incorreto
     * Fluxograma:
     * Testes: enunciado
     */

    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe M, F ou I: ");
        String resposta = leitor.next();
        resposta = resposta.toUpperCase(); //coloca em maiúsculo
        char sexo = resposta.charAt(0); //pega o primeiro caracter da String

        //char s = leitor.next().toUpperCase().charAt(0);

        if (sexo == 'M') {
            System.out.println("Masculino");
        } else if (sexo == 'F') {
            System.out.println("Feminino");
        } else if (sexo == 'I') {
            System.out.println("Não informado");
        } else {
            System.out.println("Valor inválido");
        }
        leitor.close();
    }
}
