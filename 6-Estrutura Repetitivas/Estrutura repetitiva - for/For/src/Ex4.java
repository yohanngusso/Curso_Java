import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de Iterações: ");
        int N = sc.nextInt();
        double x1,x2,div;


        for (int i=0; i<N; i++){
            System.out.println("Digite o primeiro numero: ");
            x1 = sc.nextDouble();
            System.out.println("Digite o segundo numero: ");
            x2 = sc.nextDouble();
            if(x2 == 0){
                System.out.println("Divisão impossivel");
            }
            else{
                div = x1/x2;
                System.out.println(div);
            }
        }
        sc.close();
    }
}
