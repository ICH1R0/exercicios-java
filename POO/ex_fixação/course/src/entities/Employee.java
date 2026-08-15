package entities;

public class Employee {

    public String name;
    public double GrossSalary;
    public double Tax;

    public double NetSalaty (){
        return GrossSalary - Tax;
    };

    public void IncreaseSalary (double percentage){
        double increase = (GrossSalary / 100) * percentage;

        this.GrossSalary += increase;
    };


}
