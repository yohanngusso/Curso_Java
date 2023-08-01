package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

//declarando e criando constante

public class Program1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter radius: ");
        double radius2 = sc.nextDouble();

        double c = Calculator.circumference(radius2);

        double v = Calculator.volume(radius2);

        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI value: %.2f%n",Calculator.PI);

        sc.close();
    }
}

