import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int Inputnumber;
    public int numberofgauses;


       public int numberofgauses() {
             return numberofgauses;

       }

         public  void setnoofgauses(int noofgauses){
            this.numberofgauses= numberofgauses;
         }

         
    void game() {
        Random rand=new Random();

        this.number=rand.nextInt(100);
    }
      int takeuserinput(){
        System.out.println("guass the number");
        Scanner sc=new Scanner(System.in);
        Inputnumber=sc.nextInt();
           return Inputnumber;

      }
        boolean iscorrectnumber(int num){
            if (num==number){
               return true;
            }
            else if(num<number){
                System.out.println("too low......");
            }
            else if(num>number){
                System.out.println("too high......");
            }


           return false;
        }


}

public class cwh_50exsolve {
    public static void main(String[] args) {


        game g=new game();
        boolean b=false;
        while(!b){
        g.takeuserinput();
       b= g.iscorrectnumber(0);
        System.out.println(b);}
    }

}
