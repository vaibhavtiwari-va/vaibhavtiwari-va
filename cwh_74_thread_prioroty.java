class mythr1 extends Thread{
    public mythr1(String Name){
        super(Name);

    }
    public void run(){
        int i=34;
        
        while(true){
         //   System.out.println("i am a Thread");
         System.out.println("Thank you:"+ this.getName());
            i++;
        }
    }
}
   public class cwh_74_thread_prioroty {
    public static void main(String[] args) {
        mythr1 y=new mythr1("vaibhav");
        mythr1 y2=new mythr1("bholu");
        mythr1 y3=new mythr1("tapu");
        mythr1 y4=new mythr1("sonu");
        mythr1 y5=new mythr1("pinku(most Important)");
        y5.setPriority(Thread.MAX_PRIORITY);
        y4.setPriority(Thread.MAX_PRIORITY);
        y3.setPriority(Thread.MAX_PRIORITY);
        y2.setPriority(Thread.MAX_PRIORITY);
        y.setPriority(Thread.MAX_PRIORITY);
        y.start();
        y2.start();
        y4.start();
        y3.start();
        y5.start();

    }

}
