import java.util.Scanner;

public class Unid4Exe27{


    /*
     * Entradas: horaChegada minChegada horaSaida minSaida
     * Saídas: o valor e o tempo de permanência
     * Processo: 
     * horarioPermanencia = horaSaida - horaChegada
     * 
     * testar se o minSaida > minChegada
     * minPermanencia = minSaida - minChegada
     * senao
     * minPermanencia = minChegada - minSaida
     * 
     * arredondar a hora se necessário
     * calcular o valor conforme a taxa da hora
     * 
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Escreva a hora de chegada " +
            "e minuto de chegada (hh mm): ");
        int horaChegada = s.nextInt();
        int minChegada = s.nextInt();

        System.out.println("Escreva a hora de saída " +
            "e o minuto de saída (hh mm): ");
        int horaSaida = s.nextInt();
        int minSaida = s.nextInt();

        int horarioPermanencia = horaSaida - horaChegada;
        int minPermanencia = Math.abs(minSaida - minChegada);

        if (minPermanencia > 30) {
            horarioPermanencia++;
            //horarioPermanencia = horarioPermanencia + 1;
            //horarioPermanencia += 1;
        }

        float valorPagar = 0;
        switch (horarioPermanencia) {
            case 0:
            case 1: valorPagar = 5;
                break;
            case 2: valorPagar = 10;
                break;
            case 3: valorPagar = 17.50f;
                break;
            case 4: valorPagar = 25;
                break;
            default: 
               valorPagar = 35 + (horarioPermanencia - 5) *10;        
               break;
        }

        System.out.println("Preço cobrado = R$" + valorPagar);
        System.out.println("Tempo de permanência: " + 
            horarioPermanencia + " horas");
        s.close();


    }
}