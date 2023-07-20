import java.util.Scanner;

public class Linha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        String f1,f2,f3;

        n1 = sc.nextInt();
        sc.nextLine(); //arrumando a quebra de linha
        f1 = sc.nextLine();
        f2 = sc.nextLine();
        f3 = sc.nextLine();


        System.out.println("DADOS DIGITADOS:");
        System.out.println(n1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        sc.close();
    }
}
