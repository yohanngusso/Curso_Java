import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod;
        int alc = 0;
        int gaso = 0;
        int dis = 0;
        System.out.println("Digite um código: ");
        cod = sc.nextInt();
        
        while (cod!=4) {
            if (cod == 1) {
                alc += 1; // alc = alc + 1;
            }
            else if(cod == 2){
                gaso +=1;
            }
            else if(cod == 3){
                dis +=1;
            }
            System.out.println("Digite um código: ");
            cod = sc.nextInt();
        }

        System.out.println("Muito Obrigado");
        System.out.printf("Álcool: %d%n",alc);
        System.out.printf("Gasolina: %d%n",gaso);
        System.out.printf("Diesel: %d%n",dis);
        sc.close();


        
    }
}
