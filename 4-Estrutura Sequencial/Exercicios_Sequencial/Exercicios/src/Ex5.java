import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPeca1,codPeca2,numPeca1,numPeca2;
        double valorPeca1,valorPeca2,valorPagar;

        System.out.println("Digite o código da peça 1: ");
        codPeca1 = sc.nextInt();
        System.out.println("Digite o número de peças: ");
        numPeca1 = sc.nextInt();
        System.out.println("Digite o valor unitário da peça 1: ");
        valorPeca1 = sc.nextDouble();
        System.out.println("Digite o código da peça 2: ");
        codPeca2 = sc.nextInt();
        System.out.println("Digite o número de peças 2: ");
        numPeca2 = sc.nextInt();
        System.out.println("Digite o valor unitário da peça 2: ");
        valorPeca2 = sc.nextDouble();

        valorPagar = (numPeca1 * valorPeca1)+(numPeca2 * valorPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorPagar);
        sc.close();


    }
}
