import java.util.Scanner;
public class Gradebook {
    private String CourseName;

    public Gradebook(String name){
        CourseName = name;
    }

    public void setCourseName(String name){
        CourseName = name;
    }

    public String getCourseName(){
        return CourseName;
    }

    public void displayMessage(){
        System.out.printf("This is the gradebook for \n%s!\n\n", getCourseName());
    }
}

public void ClassAverage(){
    Scanner input = new Scanner(System.in);
    int total = 0, counter = 1, grade, Average;
    while (counter <= 10){
        System.out.println("Enter Grade");
        grade = input.nextInt();
        total = total + grade;
        counter = counter + 1;
    }
    Average = (total/10);
    System.out.printf("\nTotal of all 10 grades is %d\n", total);
    System.out.printf("\nAverage is %d\n", Average);
}