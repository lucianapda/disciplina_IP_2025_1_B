import java.util.Scanner;

public class Unid6Exe05 {

    public Unid6Exe05() {
        Scanner teclado = new Scanner(System.in);
        int v[] = new int[5];
        iniciar(v);
        imprimir(v);

        int vetor[] = {6,2,1,5,3,4,1};
        bolha1(vetor);
        imprimir(vetor);
        int vetor2[] = {6,2,1,5,3,4,1};
        bolha2(vetor2);
        imprimir(vetor2);

        int quantidade = 0;
        quantidade = inserir(v, quantidade);
        quantidade = inserir(v, quantidade);

        teclado.close();
    }

    private int buscar(int vetor[], int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            //fazer
            return 0;
        }
        //fazer
        return 0;
    }
    private int inserir(int vetor[], int quantidade) {
        //....
        quantidade++;
        return quantidade;
    }
    private void iniciar(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.MIN_VALUE;
        }
    }


 
    private void imprimir(int vetor[]) {
        for (Integer i: vetor) {
            System.out.print(i + " ");
        }
        /*for (String palavra: vetor) {
            System.out.println(palavra);
        }*/
        System.out.println();
    }


    // ordenada n*n até o final e volta da origem
    private void bolha1(int vetor[]) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int auxiliar = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = auxiliar;
                }
            }
        }
    }

    //ordena enquanto houver
    private void bolha2(int vetor[]) {
        boolean trocou = true;
        while (trocou) {
            trocou = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        new Unid6Exe05();
    }
}
