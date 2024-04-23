// A progam that mplements and sums the below matrics
// A = [ 1 0 2 ]     B = [ 0 0 2 ]
//     [ 5 1 3 ]         [ 1 1 0 ]
//     [ 4 2 5 ]         [ 5 1 1 ]

import java.util.Scanner;

public class Matrix {
    public static void main(String args[]){
        int MatA [][] = new int[2][2];
        int MatB [][] = new int[2][2];
        int sum [][] = new int[2][2];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for Matrix A");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                MatA[i][j] = input.nextInt();
            }
        }


    }
}
