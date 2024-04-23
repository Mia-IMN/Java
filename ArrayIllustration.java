// A program to calculate the series of 10 subjects

import java.util.Scanner;
public class ArrayIllustration {
    public static void main(String args[]){
        int sum = 0;
        Scanner in = new Scanner(System.in);
        int scores[] = new int[11]; //Array declaration
        System.out.println("Enter scores for 10 subjects");
        for(int i=1; i <= 10; i++){
            System.out.print("Score " + i + " = ");
            scores[i] = in.nextInt();
            sum += scores[i];
        }
        System.out.println("The total of the scores is " + sum);
        in.close();
    }
}
