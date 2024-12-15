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
public class cwh_66_access_modifiers {
    public static void main(String[] args) {
       
     c1 c=new c1();
    
      System.out.println(c.x);
      System.out.println(c.y);
     // System.out.println(c.a);
      System.out.println(c.z);
    }

}
