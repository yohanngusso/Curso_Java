import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de iterações: ");
        int N = sc.nextInt();
        double x1,x2,x3,media;


        for(int i = 0; i < N; i++){
            System.out.println("Digite o primeiro número: ");
            x1 = sc.nextDouble();
            System.out.println("Digite o segundo número: ");
            x2 = sc.nextDouble();
            System.out.println("Digite o terceiro número: ");
            x3 = sc.nextDouble();
            media = (x1+x2+x3)/3;
            System.out.printf("%.1f\n",media);
        }
        sc.close();
    }
}
