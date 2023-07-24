import java.util.Scanner;

public class CriandoFuncoes {
    public static void main(String[] args) {
        // criando um program para achar o maior entre os 3 numeros
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /*
          Utilizando condições direto no main
        if(a > b && a > c){
            System.out.println("Higher = " + a);
        }
        else if(b > c){
            System.out.println("Higher = " + b);
        }
        else{
            System.out.println("Higher = " + c);
        }
        */

        // utilizando funções
        int higher = max(a, b, c);
        showResult(higher);
        sc.close();
    }
    //criando as funções

    public static int max(int x, int y, int z){
        int aux;
        if(x > y && x > z){
            aux = x;
        }
        else if(y > z){
            aux = y;
        }
        else{
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
}   
