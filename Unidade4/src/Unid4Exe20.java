import java.text.DecimalFormat;
import java.util.Scanner;

public class Unid4Exe20 {

    /*
     * Entradas: nota1, nota2, nota3, notaExercicio
     * Saídas: media, conceito, statusAprovacao
     * Processo:
     * media = (nota1 + nota2*2 + nota3*3 + notaExercicios)/7
     * comparar a media com tabela de conceitos e imprimir o conceito
     * comparar o conceito se for A, B ou C - aprovado senão reprovado
     */
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe 3 notas de " +
                "3 provas e a nota dos exercícios");
        double nota1 = leitor.nextDouble();
        if (nota1 >= 0 && nota1 <= 10) {
            double nota2 = leitor.nextDouble();
            if (nota2 >= 0 && nota2 <= 10) {
                double nota3 = leitor.nextDouble();
                if (nota3 >= 0 && nota3 <= 10) {
                    double notaExercicio = leitor.nextDouble();
                    if (notaExercicio >= 0 && notaExercicio <= 10) {
                        /*
                         * if (nota1 >= 0 && nota1 <= 10 &&
                         * nota2 >= 0 && nota2 <= 10 &&
                         * nota3 >= 0 && nota3 <= 10 &&
                         * notaExercicio >= 0 && notaExercicio <= 10) {
                         */
                        double media = (nota1 + nota2 * 2 +
                                nota3 * 3 + notaExercicio) / 7;

                        String conceito = "";
                        if (media >= 9) {
                            conceito = "A";
                        } else if (media >= 7.5 && media < 9) {
                            conceito = "B";
                        } else if (media >= 6 && media < 7.5) {
                            conceito = "C";
                        } else if (media >= 4 && media < 6) {
                            conceito = "D";
                        } else {
                            conceito = "E";
                        }

                        String status = "";
                        if (conceito.equals("A") ||
                                conceito.equals("B") ||
                                conceito.equals("C")) {
                            status = "Aprovado";
                        } else {
                            status = "Reprovado";
                        }

                        DecimalFormat df = new DecimalFormat("#0.00");
                        System.out.println("A média de aproveitamento foi: " +
                                df.format(media) +
                                ". Conceito: " + conceito + ". " + status);

                        /*
                         * } else {
                         * System.out.println("As notas devem ser entre 0 e 10");
                         * }
                         */
                    } else {
                        System.out.println("A nota de exercício deve ser entre 0 e 10");
                    }
                } else {
                    System.out.println("A nota 3 deve ser entre 0 e 10");
                }
            } else {
                System.out.println("A nota 2 deve ser entre 0 e 10");
            }
        } else {
            System.out.println("A nota 1 deve ser entre 0 e 10");
        }
        leitor.close();
    }
}
