package entities;

public class Funcionario {
    
    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary += (grossSalary * percentage);
        grossSalary -= tax;
    }

    public String toString(){
        return "Updated data: "
        + name
        + ", "
        + " $ "
        + grossSalary;
    }
}
