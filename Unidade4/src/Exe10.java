
import java.util.Scanner;

/*Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha.
 Faça um algoritmo para ler as idades dos filhos e exibir quem
  é o caçula da família; suponha que não haja empates. 
  
  Entrada: idadeMarquinhos, idadeZezinho, idadeLuluzina
  Saída: maisNovo

  Processo: verificar o menor número entre as idades informadas

  Fluxograma: draw.io
  
  Testes:
  t1) 08 10 12 -> Marquinhos
  t2) 10 11 05 -> Luluzinha
  t3) 18 11 15 -> Zezinho
  */
public class Exe10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escreva a idade do Marquinhos, Zezinho e Luluzinha: "); 
        int idadeMarquinhos = s.nextInt();
        int idadeZezinho = s.nextInt();
        int idadeLuluzina = s.nextInt();

        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzina) { 
            System.out.println("Marquinhos");
        } else if (idadeZezinho < idadeLuluzina) {
            System.out.println("Zezinho");
        } else {
            System.out.println("Luluzinha");
        }

        s.close();
    }
}