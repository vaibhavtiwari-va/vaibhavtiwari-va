class practice13 extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
                }
                catch(Exception e){
                    System.out.println(e);
                }
    
            System.out.println("good morning");
        }
    }
}
class practice13b extends Thread{
    public void run(){
       /*  while(false){
            try{
            Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }

            
            System.out.println("welcome");
        
    }*/
}
}
   public class cwh_76_practiceset {
    public static void main(String[] args) {
        practice13 e1=new practice13();
        practice13b e2=new practice13b();
       // e1.setPriority(3);
      //  e2.setPriority(5);
       // System.out.println(e1.getPriority());
      //  System.out.println(e2.getPriority());
        System.out.println(e2.getState());
    
       // e1.start();
        e2.start();
        System.out.println(e2.getState());
        System.out.println(Thread.currentThread().getState());
        
    }

}
