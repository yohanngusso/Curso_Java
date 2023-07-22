import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de Iterações: ");
        int N = sc.nextInt();
        int x;
        int soma_int = 0;
        int soma_out = 0;


        for(int i = 0; i < N; i++){
            System.out.println("Digite um número: ");
            x = sc.nextInt();
            if( x >= 10 && x <= 20){
                soma_int += 1;
            }
            else{
                soma_out +=1;
            }
        }
        System.out.println(soma_int + " int ");
        System.out.println(soma_out + " out ");
        sc.close();

    }
}
