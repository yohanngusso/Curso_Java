import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //Programa para ler o valor do raio de um circulo, e dps mostrar o valor da área do circulo
        // area do circulo = Pi.raio^2
        // valor de PI = 3.14159
        // Resultado com 4 casas decimais
        Locale.setDefault(Locale.US);
        double area,pi,raio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        raio = sc.nextDouble();
        pi = 3.14159;
        area = pi*(Math.pow(raio, 2));
        System.out.printf("A área do circulo é = %.4f%n",area);
        sc.close();



    }
}
