import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // Plano cartesiano funciona assim Numeros positivos: em +X e +Y
        // Numeros negativos: em -X e -Y 
        // Primeiro quadrante: +X e +Y -> x>0 || y>0
        // Segundo quadrante: -X e +Y -> x<0 || y>0
        // Terceiro quadrante: -X e -Y -> x<0 || y<0
        // Quarto quadrante: +X e -Y -> x>0 || y<0
        Scanner sc = new Scanner(System.in);

        int x,y;
        System.out.println("Digite a coordenada X: ");
        x = sc.nextInt();
        System.out.println("Digite a coordenada Y: ");
        y = sc.nextInt();

        while (x!=0 || y!=0) {
            if (x > 0 && y > 0){
                System.out.println("Primeiro quadrante");
                break;
            }
            else if(x < 0 && y > 0){
                System.out.println("Segundo quadrante");
                break;
            }
            else if(x < 0 && y < 0){
                System.out.println("Terceiro quadrante");
                break;
            }
            else{
                System.out.println("Quarto quadrante");
                break;
            }
        }
        sc.close();
        
    }
}
