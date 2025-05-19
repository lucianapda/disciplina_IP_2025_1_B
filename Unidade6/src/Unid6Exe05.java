import java.util.Scanner;

public class Unid6Exe05 {

    public Unid6Exe05() {
        Scanner teclado = new Scanner(System.in);
        String respostasMoca[] = new String[5];
        String respostasRapaz[] = new String[5];

        System.out.println("Respostas da Moça: resposta SIM, NAO ou IND");
        lerRespostas(respostasMoca, teclado);

        System.out.println("Respostas do Rapaz: resposta SIM, NAO ou IND");
        lerRespostas(respostasRapaz, teclado);

        int somaAfinidade = calcularAfinidade(respostasMoca, respostasRapaz);

        if (somaAfinidade == 15) {
            System.out.println("Casem");
        } else if (somaAfinidade >= 10 && somaAfinidade <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (somaAfinidade >= 5 && somaAfinidade <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (somaAfinidade >= 0 && somaAfinidade <= 4) {
            System.out.println("Vale um encontro.");
        } else if (somaAfinidade >= -1 && somaAfinidade <= -9) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }

        teclado.close();
    }

    private int calcularAfinidade(String respostasMoca[], String respostasRapaz[]) {
        int somaAfinidade = 0;
        for (int i = 0; i < respostasMoca.length; i++) {
            if (respostasMoca[i].equalsIgnoreCase(respostasRapaz[i])) {
                somaAfinidade += 3;
            } else if (!respostasMoca[i].equalsIgnoreCase(respostasRapaz[i])) {
                somaAfinidade -= 2;
            } else {
                somaAfinidade += 1;
            }
        }
        return somaAfinidade;
    }

    private void lerRespostas(String[] respostas, Scanner s) {
        String perguntas[] = { "Gosta de música sertaneja?", "Gosta de futebol?",
                "Gosta de seriados?", "Gosta de redes sociais?", "Gosta da Oktoberfest?" };

        for (int i = 0; i < perguntas.length; i++) {
            do {
                System.out.print(perguntas[i] + " ");
                respostas[i] = s.next(); // SIM, NAO, IND
            } while (!respostas[i].equalsIgnoreCase("SIM") &&
                    !respostas[i].equalsIgnoreCase("NAO") &&
                    !respostas[i].equalsIgnoreCase("IND"));
        }
    }

    public static void main(String[] args) {
        new Unid6Exe05();
    }
}
