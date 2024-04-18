import java.util.Scanner;
public class Demo{
public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int total = 0, counter = 1, grade, Average;
    while (counter <= 10){
        System.out.printf("Enter Grade %d: ", counter);
        grade = input.nextInt();
        total = total + grade;
        counter = counter + 1;
    }
    Average = (total/10);
    System.out.printf("\nTotal of all 10 grades is %d\n", total);
    System.out.printf("\nAverage is %d\n", Average);
    input.close();
}
}