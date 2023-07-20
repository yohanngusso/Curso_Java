import java.util.Scanner;

public class MathExample {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double n1,n2,n3,n4,n5,n6;
        double v1,v2,v3,v4,v5,v6;

        System.out.println("Digite um número quebrado:");
        n1 = sc.nextDouble();
        System.out.println("Digite um número quebrado:");
        n2 = sc.nextDouble();
        System.out.println("Digite um número quebrado:");
        n3 = sc.nextDouble();
        System.out.println("Digite um número quebrado:");
        n4 = sc.nextDouble();
        System.out.println("Digite um número quebrado:");
        n5 = sc.nextDouble();
        System.out.println("Digite um número negativo:");
        n6 = sc.nextDouble();

        v1 = Math.sqrt(n1);
        v2 = Math.sqrt(n2);
        v3 = Math.sqrt(n3);
        v4 = Math.sqrt(n4);
        v5 = Math.sqrt(n5);
        v6 = Math.abs(n6);

        System.out.println(n1);
        System.out.printf("A raiz quadrada de %.2f%n",v1);
        
        System.out.println(n2);
        System.out.printf("A raiz quadrada de %.2f%n",v2);
        
        System.out.println(n3);
        System.out.printf("A raiz quadrada de %.2f%n",v3);
        
        System.out.println(n4);
        System.out.printf("A raiz quadrada de %.2f%n",v4);
        
        System.out.println(n5);
        System.out.printf("A raiz quadrada de %.2f%n",v5);

        System.out.println(n6);
        System.out.printf("O número agora positivo é: %.2f",v6);


        sc.close();
        
        
    }
}
