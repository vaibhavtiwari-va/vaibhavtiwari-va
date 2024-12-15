//import java.util.Scanner;
class c1{
    public int x=5;
    protected int y= 6;
    int z=45;
    private int a=67;
    public void meth2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(z);
    }

}
public class cwh_65_packages {
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        c1 x=new c1();
        System.out.println(x.y);
    }

}
