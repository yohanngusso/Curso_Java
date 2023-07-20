import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um número inteiro: ");
        x = sc.nextInt();

        if (x<0) {
            System.out.println("NEGATIVO");
        }
        else{
            System.out.println("NÃO NEGATIVO");
        }
        sc.close();
    }
}
