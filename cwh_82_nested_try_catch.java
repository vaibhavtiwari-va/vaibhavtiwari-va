import java.util.Scanner;

public class cwh_82_nested_try_catch {
     public static void main(String[] args) {
        int[] marks= new int[3];
        marks[0] = 7;
        marks[1] =3;
        marks[2] =56;
         Scanner sc=new Scanner(System.in);
         boolean flage=true;
         while (flage){
         System.out.println("enter the value of index");
        
        int ind=sc.nextInt();

    try{
        System.out.println("welcome to video 82");
     try{
        System.out.println(marks[ind]);
     
     flage=false;
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("sorry this index is not exist");
        System.out.println("exception in level 2");
     }
}
    catch(Exception e){
            System.out.println("exception in next level 1");
         }
        }
    }
}
