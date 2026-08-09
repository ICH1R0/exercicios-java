package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measure of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measure of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = calculateArea(x.a, x.b, x.c);

        double areaY = calculateArea(y.a, y.b, y.c);

        System.out.printf("triangle X area: %.4f%n", areaX);
        System.out.printf("triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println( "Larger area: X");
        }
        else{
            System.out.println( "Larger area: Y");
        }


        sc.close();
    }

    public static double calculateArea(double a, double b, double c) {
        double area;
        double p = (a + b + c) / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
}
