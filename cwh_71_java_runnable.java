class mythreadsrunnable1 implements Runnable{
    public void run(){
        while(true){
        System.out.println("iam a thread not  a threat");
    }
    }
}
class mythreadsrunnable2 implements Runnable{
    public void run(){
        while(true){
        System.out.println("iam  not a threat");
    }
    }
}
 public class cwh_71_java_runnable {
    public static void main(String[] args) {
        mythreadsrunnable1 bullet1=new mythreadsrunnable1();
        Thread gun1=new Thread(bullet1);
        mythreadsrunnable2 bullet2= new mythreadsrunnable2();
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();
    }

}
