import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.println("Digite o número:");
        x = sc.nextInt();

        for(int i = 1; i <= x; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
