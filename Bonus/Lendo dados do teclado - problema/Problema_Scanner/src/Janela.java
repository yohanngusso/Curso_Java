import javax.swing.JOptionPane;

public class Janela {
    public static void main(String[] args) {
        
        String idade = JOptionPane.showInputDialog(null, "Qual é sua idade ?", "idade",JOptionPane.QUESTION_MESSAGE);
        System.out.println(idade);
    }
}
