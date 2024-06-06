package UdemyCourse.OOPAdvance.ExerciseOOPAdvances;

import java.util.Scanner;

public class Employee implements IPerson {
    private int id;
    private String name;
    private double salary;

    public Employee() {
        this(0, null, 0);
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double income() {
        return salary;
    }

    @Override
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID");
        id = sc.nextInt();

        sc.nextLine();

        System.out.println("Nhap name");
        name = sc.nextLine();

        System.out.println("Nhap salary");
        salary= sc.nextFloat();

    }

    @Override
    public void display() {
        System.out.printf("ID: %d, Name: %s,  Salary: %f", id, name, salary);
    }
}
