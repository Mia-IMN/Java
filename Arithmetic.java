import java.util.Scanner;
public class Arithmetic {
    public static void main(String args[]){
        int a, b, c;
        int sum, smallest, largest;
        double average, product;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number a: ");
        a = in.nextInt();
        System.out.println("Enter second number b: ");
        b = in.nextInt();
        System.out.println("Enter third number c: ");
        c = in.nextInt();

        largest = a;
        smallest = a;

        // Getting the largest
        if (b > largest) {
            largest = b;
        }
        if (c > largest){
            largest = c;
        }

        // Getting the smallest
        if (b < smallest && b < c){
            smallest = b;
        }
        if (c < smallest && c < b){
            smallest = c;
        }

        // Getting the sum
        sum = a + b + c;

        // Getting the Average
        average = sum/3;

        // Getting the product
        product = a * b * c;

        // Printing out the largest
        System.out.printf("The largest of all three numbers is: %d\n", largest);

        // Printing out the smallest
        System.out.printf("The smallest of all three numbers is: %d\n", smallest);

        // Printing out the sum
        System.out.print("The sum is: " + sum);

        // Printing out the average
        System.out.print("\nThe average is: " + average);

        // Printing out the product
        System.out.print("\nThe product of all three is: " + product);

        in.close();

    }
}
