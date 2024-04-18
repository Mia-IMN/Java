import java.util.Scanner;
public class Main {
    public class Arithmetic{

    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1;
        num1 = input.nextInt();
    }
}

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
