import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A,B,C,trianguloRetangulo,areaCirculo,areaTrapezio,
        areaQuadrado,areaRetangulo;

        System.out.println("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        B = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        C = sc.nextDouble();

        trianguloRetangulo = (A*C/2);
        areaCirculo = 3.14159 * C * C;
        areaTrapezio = ((A+B)*C)/2;
        areaQuadrado = B*B;
        areaRetangulo = A * B;

        System.out.printf("TRIÂNGULO: %.3f%n", trianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n",areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETÂNGULO: %.3f%n", areaRetangulo);
        sc.close();

    }
}
