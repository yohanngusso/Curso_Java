import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int horaInicial,horaFinal,duracao;

        System.out.println("Digite a hora inicial do jogo: ");
        horaInicial = sc.nextInt();
        System.out.println("Digite a hora final do jogo: ");
        horaFinal = sc.nextInt();

        if(horaInicial < horaFinal){   //Sentido lógico normal não acaba na madrugada
            duracao = horaFinal - horaInicial; 
        }
        else{
            duracao = 24 + horaFinal - horaInicial; // Sentido lógico caso acabe(hora final) no horario de madrugada
            // 24 para trocar o horario de madrugada para acertar o horario correto da conta
        }
        System.out.printf("O JOGO DUROU %d%n HORA(S)",duracao);
        sc.close();
        
    }
}
