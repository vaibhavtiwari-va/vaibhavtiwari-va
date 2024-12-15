
class mynewthr1 extends Thread{
    private static Runnable Name;
    public mynewthr1(){
        super(Name);

    }
    public void run(){
        int i=0;
        
        while(i<5600){
         //   System.out.println("i am a Thread");
         System.out.println("Thank you:");
            i++;
        }
    }
}
class mynewthr2 extends Thread{
    private static final Runnable Name = null;
    public mynewthr2(){
        super(Name);

    }
    public void run(){
        int i=34;
        
        while(i<89){
         //   System.out.println("i am a Thread");
         System.out.println(" i am Thank you:");
            i++;
        }
    }
}
   public class cwh_75_methods_inthrads {
    public static void main(String[] args) {
        mynewthr1 t1= new mynewthr1();
        mynewthr2 t2= new mynewthr2();
        t1.start();
       try{
        t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
        
    }

}
