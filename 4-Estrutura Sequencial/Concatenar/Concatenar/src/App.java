import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US); // separador de casas deciamis em ponto inves de virgula
        double x = 23.7529;
        System.out.printf("%.2f%n",x);

        //Concatenar varios elementos
        int n1,n2,soma;
        n1 = 2;
        n2 = 3;
        soma = n1 + n2;
        System.out.println("A soma do "+ n1 + " com o "+ n2 + " é: " + soma);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e possui uma renda de R$ %.2f reais %n",nome,idade,renda);

        String nome2 = "Yohann";
        int idade2 = 23;
        double renda2 = 1660.0;
        System.out.printf("%s tem %d anos e possui uma renda de R$ %.2f reais %n",nome2,idade2,renda2);

    }
}
