package entities;

public class Student {
    public String name;
    public double n1,n2,n3,grade;

    public double finalGrade(){
        double grade = (n1 + n2 + n3);
        return grade;
    }
    public void status(){
        if(finalGrade()>=60.00){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAILED");
            grade = 60.00 - finalGrade();
            System.out.printf("MISSING %.2f POINTS\n",grade);
        }
    }
}
