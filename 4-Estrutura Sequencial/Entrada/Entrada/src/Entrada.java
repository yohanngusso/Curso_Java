import java.util.Locale;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String x;
        int n1;
        double n2;
        char y;
        x = sc.next();
        System.out.printf("Você digitou: %s%n",x);

        n1 = sc.nextInt();
        System.out.printf("O número inteiro é: %d%n",n1);

        n2 = sc.nextDouble();
        System.out.printf("O número double é: %.2f%n",n2);

        y = sc.next().charAt(0);
        System.out.printf("A letra que vc digitou é: %c%n",y);

        sc.close();
    }
}
