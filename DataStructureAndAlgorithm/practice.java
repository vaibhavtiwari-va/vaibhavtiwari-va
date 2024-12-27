package DataStructureAndAlgorithm;

import java.util.Scanner;

public class practice {

    static void fibonacci(int N){
        int num1=0; int num2=1;

        for(int i=0; i<N; i++){
            System.out.println("num1"+ " ");

            int num3=num1+num2;
            num1=num2;
            num2=num3;
        }
    }

    // static int gcd(int a,int b){
    //     int result=Math.min(a, b);
    //     while(result>0){
    //         if(a % result==0 && b% result==0){
    //             break;
    //         }
    //         result--;
    //     }
    //     return result;

    // }
    // public static long power(int x, int n)
    // {
    //     // Initialize result by 1
    //     long pow = 1L;

    //     // Multiply x for n times
    //     for (int i = 0; i < n; i++) {
    //         pow = pow * x;
    //     }

    //     return pow;
    // }
    //   public void positivenumb(){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enetr positive number");
    //     int positive=sc.nextInt();

        
       
    //   }

    //   public void negetivenumb(){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enetr negetive number");
    //     int negetive=sc.nextInt();

       

        
    //   }

    //   public void zero(){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enetr zero number");
    //     int zero=sc.nextInt();

       
    //   }

    //   public void display(){
    //     practice obj=new practice();
    //     obj.positivenumb();
    //     obj.negetivenumb();
    //     obj.zero();
       
        
    //   }
    
    public static void main(String[] args) {
      //  Question 1
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter the number");
    //     int a=sc.nextInt();

        
    //     System.out.println("Enter the number");
    //     int b=sc.nextInt();

        
    //     System.out.println("Enter the number");
    //     int c=sc.nextInt();
    //     sc.close();
    //     System.out.println("the sum of average is:" +avr(a, b, c));
    // }

    
    // public static int avr(int a, int b ,int c){
    //     return(a+b+c)/3;
        
    // }

    //Question 2
    // for(int a=1; a<10; a++){
       
    //     if(a% 2 != 0){
    //         System.out.println(a);
    //     }
    // }
    
    //Question 3
    // int a=10;
    // int b=24;

    // if(a<b){
    //     System.out.println("b");
    // }
    // else{
    //     System.out.println("a");
    // }

    //Question 4
   //  Scanner sc=new Scanner(System.in);
    // System.out.println("enter the radius");
    // int radius=sc.nextInt();
   
    

    // System.out.println("the circumference of circle is:" + 2*3.14*(radius));
   

    //Question 5
//     System.out.println("Enter the age");
//     int age=sc.nextInt();

//     if(age>=18){
//         System.out.println("you are eligible to vote");
//     }
//     else{
//         System.out.println("you are not eligible to vote");
//     }

     // Question 6
    //  while (true) {
    //    for(int a=0; a<100; a++){
    //     System.out.println(a);
    //    }
    //  }

    // Question 7
//    practice b=new practice();
//    b.display();


//Question 8
    //  Scanner sc=new Scanner(System.in);
    //  System.out.println("enter the value of X");
    //  int x=sc.nextInt();

    //  System.out.println("Enter the value of N");
    //   int n=sc.nextInt();

 
    //   System.out.println("number raised to the power of another number is:" +power(x,n));

    //Question 9
    // int a = 2, b = 2;
    // System.out.print("GCD of " + a + " and " + b
    //                  + " is " + gcd(a, b));
   
      
         //Question 10
       int N=10;
       fibonacci(N);
   
    
    }
    
}

