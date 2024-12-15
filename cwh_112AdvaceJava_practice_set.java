import java.io.FileWriter;
import java.io.IOException;

class mydepricated{
@Deprecated
void meth1(){
    System.out.println("i am meth 1");
}
interface myint{
    
    void Display();
}
}

public class cwh_112AdvaceJava_practice_set {
    public static void main(String[] args) {
    //     mydepricated d=new mydepricated();
    //     d.meth1();
    //    myint f=new myint(){
    //     @Override
    //     public void Display(){
    //          System.out.println("iam display");
    //     }
        
    //    };

    int i=19;
    String table="";
    for(int j=0; j<10; j++){
        table += i+ "x"+(i+j)+"="+ i+(j+i);
        table += "\n";
    }

     try{ FileWriter filterWriter=new FileWriter("multiplicationtext.text");
        filterWriter.write("this is our new file for java course /n okay no bye");
            filterWriter.close();
       }catch(IOException E) {
        E.printStackTrace();
       }
       

}
}
