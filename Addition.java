import java.util.Scanner;

public class Addition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, sum;
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.print("Enter third number: ");
        num3 = input.nextInt();
        sum = num1 + num2  + num3;
        System.out.println("The sum is " + sum);
        input.close();
    }
}
