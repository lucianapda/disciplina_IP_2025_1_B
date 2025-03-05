import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o ponto 1(X, y)");
        double x = s.nextDouble();
        double y = s.nextDouble();

        System.out.println("Digite o ponto 2 (x, y)");
        double x2 = s.nextDouble();
        double y2 = s.nextDouble();

        double diferencaX = x2 - x;
        double diferencaY = y2 - y;
        double quadradoDifX = Math.pow(diferencaX, 2);
        double quadradoDifY = Math.pow(diferencaY, 2);
        double soma = quadradoDifX + quadradoDifY;
        double distancia = Math.sqrt(soma);

        System.out.println("Distância = " + distancia);

        DecimalFormat df = new DecimalFormat("#0.0000");
        System.out.println("Distância (formatada) = " + df.format(distancia));

        s.close();
    }
}
