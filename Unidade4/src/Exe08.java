import java.util.Scanner;

public class Exe08 {

    /* Entrada: letra
     * Saída: Vogal ou Não é vogal
     * Processo: verifica se a letra é a, e, i, o ou u.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
         char letra = s.next().toLowerCase().charAt(0);

      /* if (letra == 'a' || letra == 'e' || letra == 'i' ||
             letra == 'o' || letra == 'u') {
                System.out.println("É vogal");
        } else {
                System.out.println("Não é vogal");
        }
        
*/
        switch (letra) {
            case 'a': 
            case 'e': 
            case 'i': 
            case 'o':
            case 'u': System.out.println("É vogal");
                    break;  
            default:
                System.out.println("Não é vogal");
                break;
              
        }

        s.close();
    }

}