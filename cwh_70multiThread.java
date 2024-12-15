class mythread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<4000) {
            System.out.println("my thread is running");
            System.out.println("iam happy!");
            i++;
        }
    }

}
class mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<4000) {
            System.out.println("thread 2 is good");
            System.out.println("iam sad!");
            i++;
        }
    }
}
public class cwh_70multiThread {
    public static void main(String[] args) {
        mythread1 e1=new mythread1();
        mythread2 e2= new mythread2();
        e1.start();
        e2.start();
        
    }

}
