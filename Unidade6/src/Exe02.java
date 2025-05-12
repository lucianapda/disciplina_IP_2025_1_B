import java.util.Scanner;

public class Exe02 {

    public Exe02() {
        Scanner s = new Scanner(System.in);

        double[] valores = new double[5];
        
        ler(valores, s);
        double media = calcularMedia(valores);
        

        System.out.println("Média = " + media);

        escreverAcimaMedia(valores, media);

        s.close();
    }

    public void escreverAcimaMedia(double[] valores, double media) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > media) {
                System.out.println(valores[i]);
            }
        }
    }

    public double calcularMedia(double numeros[]) {
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return (soma / numeros.length);
    }

    public void ler(double[] vetor, Scanner leitor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor[" + i+"]: ");
            vetor[i] = leitor.nextDouble();
        }
    }
    public static void main(String[] args) {
        new Exe02();
    }
}
