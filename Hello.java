import java.util.Scanner;
public class Hello {
    public static void main(String args[]){
        String name;
        Scanner input = new Scanner(System.in);
        name = new String(input.nextLine());
        System.out.printf("Hi %s!", name);   
    }
}
