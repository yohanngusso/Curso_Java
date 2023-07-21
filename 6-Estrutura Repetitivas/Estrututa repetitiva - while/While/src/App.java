import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = sc.nextInt();
        int soma = 0;

        while (x!=0) {

            soma += x; //soma = soma + x;
            System.out.println("Digite um número: ");
            x = sc.nextInt();
        }
        System.out.println("Soma: " + soma);
        sc.close();


    }
}
