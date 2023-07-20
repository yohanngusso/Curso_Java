import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US); // IMPORTANTE ESSE SER O PRIMEIRO A COLOCAR
        Scanner sc = new Scanner(System.in);
        

        int numFunc,horasTrab;
        double valorHora, salario;
        

        System.out.println("Digite o seu número: ");
        numFunc = sc.nextInt();
        System.out.println("Digite o seu número de horas trabalhadas: ");
        horasTrab = sc.nextInt();
        System.out.println("Digite o valor que você recebe por hora: ");
        valorHora = sc.nextDouble();

        salario = horasTrab * valorHora;
        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f%n",salario);
        sc.close();

    }
}
