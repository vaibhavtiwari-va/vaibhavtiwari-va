package DataStructureAndAlgorithm;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       // type[][] arrayname= new type[row][columns];
       Scanner sc=new Scanner(System.in);
       int row =sc.nextInt();
       int column=sc.nextInt();
    int[][] number= new int[row][column];


    for(int i=0; i<row; i++){
        for(int j=0; j<column; j++){
            number[i][j]=sc.nextInt();
        }
    }

   int x=sc.nextInt();
   for(int i=0; i<row; i++){
    for(int j=0; j<column; j++){
        System.out.println("x found at location ("+ i + "," + j + ")");
    }
    }

}
}
