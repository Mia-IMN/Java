// A program to print the two-dimensional array int [3] [5]

import java.util.Scanner;

public class Matrics {
    public static void main(String args[]){
        int mat[][] = new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values values of the matrix");
        for( int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                mat[i][j] = in.nextInt();
            }
        }
        System.out.println("The value entered are: ");
        for( int i = 0; i < 3; i++){
            System.out.print("{");
            for(int j = 0; j < 3; j++){
                System.out.print(" ");
                System.out.print(mat[i][j]);
                System.out.print(" ");
            }
            System.out.print("}");
            System.out.print("\n");
        }
        in.close();
    }
}
