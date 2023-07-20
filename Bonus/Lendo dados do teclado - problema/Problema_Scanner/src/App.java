import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // criado objeto para ler valores digitados no teclado


        String elo,campeao;
        int tier;
        String valor; //variavel temporaria para lidar com a quebra de linha



        System.out.println("Qual seu elo ?");
        elo = sc.nextLine();
       

        System.out.println("Qual seu tier? ");
        // tier = sc.nextInt();
        valor = sc.nextLine();
        tier = Integer.parseInt(valor);
        // convertendo uma String para aquele tipo de dado
        // Convertendo uma String para Integer -> Integer.parseInt(string)
        // Convertendo uma String para float -> Float.parseFloat(string)
        // Convertendo uma String para double -> Double.parseDouble(string)


        

        System.out.println("Qual o seu campeão preferido? ");
        campeao = sc.nextLine();
        System.out.printf("Elo: %s Tier: %s Campeão: %s \n",elo,tier,campeao);







        sc.close();
    }
}
