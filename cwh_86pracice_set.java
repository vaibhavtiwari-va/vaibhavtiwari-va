import java.util.Scanner;

public class cwh_86pracice_set {
    public static void main(String[] args) {
        //problem1
       // int a=7 syntex error
       int age=78;
       int age_born= 2000-78;// logical error
       System.out.println(6/8);

       //problem 2
       try{
       //int a=666/9;
    }
    catch(IllegalArgumentException e){
        System.out.println("haha");
    }
    catch(ArithmeticException e){
       System.out.println("hehe");
    }
    //problem 3
    boolean flag =true;
    int[] marks= new int[3];
    marks[0] = 7;
    marks[1] =3;
    marks[2] =56;
    Scanner sc=new Scanner(System.in);
    int index;
    int i=8;
    while(flag && i<5){
        try{
        index=sc.nextInt();
        System.out.println("The value of Marks[ind] is" + marks[index]);
        break;
        
    }
     catch(Exception e){

     }
     if(i>=5){
        System.out.println("error");
     }
     }
}
}