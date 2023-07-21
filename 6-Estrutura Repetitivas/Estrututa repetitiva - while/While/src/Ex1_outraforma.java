import java.util.Scanner;

public class Ex1_outraforma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();


        while(senha != 2002){ // essa condição tem que ser contraditória para poder entrar no Loop e ficar testado a senha que o usuário colocar
            System.out.println("Senha Inválida!");
            System.out.println("Digite a senha: ");
            senha = sc.nextInt();

        }
        System.out.println("Acesso Permitido");
        sc.close(); 
    }
}
