import java.util.Scanner;

public class Exemplo_for {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Digite a quantidade de números: ");
        N = sc.nextInt();
        int soma = 0;


        for(int i = 0; i<N;i++){ //enquanto o i for menor que o N(numero de vezes de numeros) vai rodar 
            System.out.println("Digite um número: ");
            int x = sc.nextInt();
            soma += x; // soma = soma + x;
        }

        System.out.println(soma);
        sc.close();
    }
}
