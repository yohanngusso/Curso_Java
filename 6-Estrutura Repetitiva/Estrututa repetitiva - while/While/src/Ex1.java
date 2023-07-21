import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha,dig;
        senha = 2002;
        dig = 0;


        while(senha != dig){ // essa condi tem que ser contraditória para poder entrar no Loop e ficar testado a senha que o usuário colocar
            System.out.println("Digite a senha: ");
            dig = sc.nextInt();
            if(senha == dig){
                break;
            }
            System.out.println("Senha Inválida!");
        }
        System.out.println("Acesso Permitido");
        sc.close(); 
    }
}
