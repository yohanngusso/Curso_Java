import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("CÓDIGO        ESPECIFICAÇÃO             PREÇO ");
        System.out.println("1             Cachorro Quente           R$ 4.00");
        System.out.println("2             X-Salada                  R$ 4.50");
        System.out.println("3             X-Bacon                   R$ 5.00");
        System.out.println("4             Torrada simples           R$ 2.00");
        System.out.println("5             Refrigerante              R$ 1.50");

        Scanner sc = new Scanner(System.in);

        int cod,quantItem;
        double precoFinal;

        System.out.println("Digite o código do produto: ");
        cod = sc.nextInt();
        System.out.println("Digite a quantidade de produto: ");
        quantItem = sc.nextInt();

        if(cod == 1){
            precoFinal = (quantItem * 4.00);
        }
        else if(cod == 2){
            precoFinal = (quantItem * 4.50);
        }
        else if(cod == 3){
            precoFinal = (quantItem * 5.00);
        }
        else if(cod == 4){
            precoFinal = (quantItem * 2.00);
        }
        else{
            precoFinal = (quantItem * 1.50);
        }
        System.out.printf("Total: R$ %.2f%n",precoFinal);
        sc.close();

    }
}
