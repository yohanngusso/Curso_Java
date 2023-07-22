import java.util.Scanner;

public class for_quant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de iterações: ");
        int N = sc.nextInt();
        String x;


        for(int i = 0; i < N; i++){
            System.out.println("Digite seu nome: ");
            x = sc.next();
            System.out.printf("\nO nome do %dº: %s\n",i+1,x);
            System.out.println();
        }
        sc.close();
    }
}
