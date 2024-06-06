package UdemyCourse.OOPAdvance.ExerciseOOPAdvances;

import java.util.Scanner;

public class Manager extends Employee {
    private double allowance;
    private String position;

    public Manager() {
       this(0, null,0, 100, "HeadOfDepartment");
    }


    public Manager(int id, String name, double salary, double allowance, String position) {
        super(id, name, salary);
        this.allowance = allowance;
        this.position = position;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


   @Override
    public void display() {
     super.display();
       System.out.printf("Postion : %s, Allowance: %f", position, allowance );
   }

   @Override
   public  void read() {
        super.read();

       Scanner sc = new Scanner(System.in);

       System.out.println("nhap vi tri");
       position = sc.nextLine();

       System.out.println("nhap allowance");
       allowance = sc.nextDouble();

   }

   @Override
   public double income() {
    return getSalary() + allowance;
   }
}
