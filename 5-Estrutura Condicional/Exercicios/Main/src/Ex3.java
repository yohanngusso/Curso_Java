import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B;

        System.out.println("Digite um número: ");
        A = sc.nextInt();
        System.out.println("Digite um número: ");
        B = sc.nextInt();

        if (A%B == 0 || B%A == 0){
            System.out.println("São Múltiplos");
        }
        else{
            System.out.println("Não são Múltiplos");
        }
        sc.close();
    }
}
