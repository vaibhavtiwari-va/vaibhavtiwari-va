import java.util.Scanner;

public class addition {
    private static final char rohan = 0;

    public static void main(String[] args) {
       System.out.println("Enter your number");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char b=rohan;
        if(b<18){
            System.out.println("you are under age");
            
        }
        else{
            System.out.println("you are adult");
        }
        
       
        
    }

}
