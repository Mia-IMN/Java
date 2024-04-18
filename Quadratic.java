//A program that calculates the result of a quadratic equation

import java.util.Scanner;
import java.lang.Math;
public class Quadratic {
    public static void main(String args[]){
        int a, b, c; 
        double disc;
        double x1, x2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coefficient of a, b and c");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        disc = (Math.pow(b, 2)) - (4*a*c);
        System.out.println(disc);
        if (disc > 0){
            x1 = - b + Math.sqrt(disc)/(2*a);
            x2 = - b - Math.sqrt(disc)/(2*a);
            System.out.printf("x1 = %.2f\nx2 = %.2f", x1, x2);
        }
        // When disc is equal to 0
        if (disc == 0){
            x1 = (-b/(2*a));
            x2 = -(-b/(2*a));
            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
        }
        // When disc is less than 0
        if (disc < 0){
            System.out.println("Imaginary");
        }
        input.close();
    }
}
