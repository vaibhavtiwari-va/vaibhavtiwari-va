import java.util.*;
class calculator extends Exception{
    @Override
    public String toString(){
        return "result shoulde be under rules";
    }
    @Override
    public String getMessage(){
        return "results must bee";
        
    }
}
public class cwh_87practice_set {
    public static   double addition(double a,double b)throws ArithmeticException{
        double result=a+b;
         return result;
     }
     public static   double Subtraction(double num1 ,double num2)throws ArithmeticException{
        double result=num1-num2;
         return result;
     }
     public static   double multiplication(double num3 ,double num4)throws ArithmeticException{
        double result=num3*num4;
         return result;
     }



    public static   double divide(double num5 ,double num6)throws ArithmeticException{
        double result=num5/num6;
         return result;
     }

     public static   double modulus(double num7 ,double num8)throws ArithmeticException{
        double result=num7%num8;
         return result;
     }
     public static   double exit()throws ArithmeticException{
        double result=exit();
         return result;
     }


    public static void main(String[] args) {
        
 /*      1. + -> Addition
2. - -> Subtraction
3. * -> Multiplication
4. / -> Division
which throws the following exceptions:
1. Invalid input Exception ex: 8 & 9
2. Cannot divide by 0 Exception
3. Max Input Exception if any of the inputs is greater than 100000
4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
    }*/

double x=1;
do{
    try{
        System.out.println("menu");
        System.out.println("1-addition");
        System.out.println("2-subtraction");
        System.out.println("3-multiplication");
        System.out.println("4-division");
        System.out.println("5-modulus");
        System.out.println("6-exit");
        System.out.println("choose option is:  ");
        Scanner sc=new Scanner(System.in);
        Scanner scan;
        int choice=sc.nextInt();

        switch(choice){
            case 1:
            System.out.println("Input two Numbers:");
            String dimension= sc.nextLine();
            String[] parts=dimension.split( " ");
            int a=Integer.parseInt(parts[0]);
            int b=Integer.parseInt(parts[1]);
            int c=a+b;
            System.out.println("sum=  "+c);
            break;
        case 2:
        System.out.println("input two number is ");
        String dif= sc.nextLine();
        String[] diffrence =dif.split("");
        int num1=Integer.parseInt(diffrence[0]);
        int num2= Integer.parseInt(diffrence[1]);
        int d=num1-num2;
        System.out.println("Diffrence=" +d);
        break;

        case 3:
        System.out.println("Input two number is");
        String mul=sc.nextLine();
        String[] multiplication= mul.split("");
        int num3=Integer.parseInt(multiplication[0]);
        int num4=Integer.parseInt(multiplication[1]);
        int e= num3*num4;
        System.out.println("multiplication= "+e);
        break;

        case 4:
        System.out.println("Input two number is ");
        String div=sc.nextLine();
        String[] division= div.split("");
        int num5=Integer.parseInt(division[4]);
        int num6=Integer.parseInt(division[2]);
        int f= num5/num6;
        System.out.println("division= "+f);
        break;

        case 5:
        System.out.println("Input two numbers is");
        String mod=sc.nextLine();
        String[] modulus=mod.split(" ");
        int num7 =Integer.parseInt(modulus[0]);
        int num8=Integer.parseInt(modulus[1]);
        int  g=num7%num8;
        System.out.println("modulus = "+g);
        break;

        case 6:
        System.out.println("Now exiting programme ");
        break;

            
        }
    } catch(Exception e){
        System.out.println("wrong input.try again");
    }
}while(x==1);
}
}