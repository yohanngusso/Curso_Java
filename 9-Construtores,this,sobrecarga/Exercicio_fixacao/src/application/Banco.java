package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Banco {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //declarando o objeto
        Conta conta;

        int numeroConta;
        String nomeTitular;
        double saldoConta;
        String aux;

        System.out.print("Enter account name: ");
        numeroConta = sc.nextInt();
        System.out.print("Enter account holder: ");
        aux = sc.nextLine();
        nomeTitular = sc.nextLine();
        char resp;
        System.out.print("Is there an initial deposit (y/n): ");
        resp = sc.next().charAt(0);
        if(resp == 'y'){
            System.out.print("Enter initial deposit value: ");
            saldoConta = sc.nextDouble();
            conta = new Conta(numeroConta, nomeTitular, saldoConta);
            System.out.println("Account data: ");
            System.out.println(conta.toString());
        }
        else{
            conta = new Conta(numeroConta, nomeTitular);
            System.out.println("Account data: ");
            System.out.println(conta.toString());
        }

        System.out.println("");
        System.out.print("Enter a deposit value: ");
        double valor = sc.nextDouble();
        conta.deposito(valor);
        System.out.println("Updated account data: ");
        System.out.println(conta.toString());

        System.out.println("");
        System.out.print("Enter a withdraw value: ");
        valor = sc.nextDouble();
        conta.saqueSaldo(valor);
        System.out.println("Updated account data: ");
        System.out.println(conta.toString());


        















        sc.close();
    }
}
