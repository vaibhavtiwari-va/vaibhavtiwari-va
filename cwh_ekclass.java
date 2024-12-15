class EKclass{
    int a;

    public int getA() {
        return a;

    } 
      EKclass(int v) {

        this.a=a;
      }
    public int returnone() {
        return 1;
    }
}
 class Doclass extends EKclass{
    Doclass(int c) {
        super(c);
        System.out.println("i am a constructor");
    }

 }
public class cwh_ekclass {
    public static void main(String[] args) {
        EKclass e= new EKclass(5);
        System.out.println(e.getA());
        Doclass d=new Doclass(56);
        System.out.println(d.getA());
    }

}
