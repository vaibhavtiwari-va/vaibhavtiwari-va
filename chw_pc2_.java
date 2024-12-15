import java.util.Scanner;
public class chw_pc2_ {
    public static void main(String[] args) {
      //  Scanner sc= new Scanner(System.in);
      //  int a= sc.nextInt ();
       // System.out.println(a>8);
       // System.out.println(7*49/7+35);
       Scanner object= new Scanner(System.in);
       System.out.println("enter name ,age ,salary");

       //String input
       String name=object.nextLine();

       //Numerical input
       int age =object.nextInt();
       double salary=object.nextDouble();

       //output input by user
       System.out.println("Name:" +name);
       System.out.println("Age:"+ age);
       System.out.println("salary:" +salary);
    }

}
