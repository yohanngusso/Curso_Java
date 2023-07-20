import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        //Ler dois valores inteiros, depois mostrar na tela a soma desses números
        
        int x1,x2,soma;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        x1 = sc.nextInt();
        System.out.println("Digite outro número inteiro: ");
        x2 = sc.nextInt();
        soma = x1 + x2;
        System.out.println("A soma dos valores é = " + soma);
        sc.close();
        
    }
}
