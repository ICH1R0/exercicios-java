package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.Tax = sc.nextDouble();
        System.out.println(" ");

        System.out.println("Employee: " + employee.name + ", $" + employee.NetSalaty());
        System.out.println(" ");
        System.out.print("Which percentage to increase salary?");
        employee.IncreaseSalary(sc.nextDouble());
        System.out.println(" ");
        System.out.println("Update data: " + employee.name + ", $" + employee.NetSalaty());






        sc.close();
    }
}
