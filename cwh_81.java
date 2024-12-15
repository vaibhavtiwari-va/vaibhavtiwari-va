import java.util.Scanner;

public class cwh_81 {
    public static void main(String[] args) {
        int[] marks= new int[3];
        marks[0] = 7;
        marks[1] =3;
        marks[2] =56;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your array");
        int ind=sc.nextInt();

        System.out.println("enter your number you want to divide with");
        int number=sc.nextInt();
        try{
            System.out.println("the value at array index enterd is:"+ marks[ind]);
            System.out.println("the value of array value/number" + marks[ind]/number);
        }
         
         catch(ArithmeticException e){
           System.out.println("Arithmaticexception is occured");
           System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
           System.out.println("ArrayIndexOutOfBoundsExceptionis occured");
          System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some exception is occured");
            System.out.println(e);
         }
    }

}
