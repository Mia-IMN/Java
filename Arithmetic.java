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

        if (b > largest) {
            largest = b;
            if (b > c){
                smallest = c; 
            }
        }
        if (c > largest){
            largest = c;
            smallest = a;
            }

        System.out.printf("The largest of all 3 numbers is: %d\n", largest);
        System.out.printf("The smallest of all 3 numbers is: %d", smallest);
    }
}
