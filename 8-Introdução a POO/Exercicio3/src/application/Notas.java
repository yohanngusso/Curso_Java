package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Notas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Student student = new Student();

        System.out.println("Digite seu nome: ");
        student.name = sc.nextLine();
        System.out.println("Digite suas notas: ");
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();
        System.out.printf("FINAL GRADE: %.2f\n",student.finalGrade());
        student.status();
        sc.close();

        
    }
    
}
