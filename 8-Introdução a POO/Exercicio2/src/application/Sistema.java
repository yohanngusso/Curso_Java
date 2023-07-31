package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Sistema {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.printf("Name: ");
        funcionario.name = sc.nextLine();
        System.out.printf("Gross Salary: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.printf("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f\n",funcionario.name,funcionario.NetSalary());
        System.out.printf("Which percentage to increase salary? ");
        double percentage = sc.nextDouble()/100;
        funcionario.increaseSalary(percentage);
        System.out.println(funcionario.toString());





        sc.close();
    }
}
