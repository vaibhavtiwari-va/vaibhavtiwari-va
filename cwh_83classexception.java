import java.util.Scanner;

class Myexception extends Exception{
    @Override
    public String toString(){
        return super.toString()+"iam toString()";
    }
    @Override
    public String getMessage(){
        return super.getMessage()+"iam getmessage()";
}  class Myexception1 extends Exception{
    @Override
    public String toString(){
        return "make sure that the age enterd is coorect";
    }
    @Override
    public String getMessage(){
        return "the age is not more then 125";
}  

        
    }


public class cwh_83classexception {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a>9){
            try{
              //  throw new Myexception();
                throw new ArithmeticException("this is an exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.getStackTrace();
                System.out.println("finished");
            }
        }

}
}
}
