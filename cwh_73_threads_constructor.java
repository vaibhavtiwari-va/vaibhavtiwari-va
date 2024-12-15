class mythr extends Thread{
    public mythr(String Name){
        super(Name);

    }
    public void run(){
        int i=34;
        System.out.println("Thank you");
        while(i<30){
            System.out.println("i am a Thread");
            i++;
        }
    }
}
  public class cwh_73_threads_constructor {
    public static void main(String[] args) {
        mythr y=new mythr("vaibhav");
        mythr y2=new mythr("bholu");
        y.start();
        y2.start();
        System.out.println("the id of the thread y is"+ y.getName());
        System.out.println("the id of the thread y is"+ y.getClass());
        System.out.println("the id of the thread y is"+ y2.getName());
        System.out.println("the id of the thread y is"+ y2.getClass());
        y2.getClass();
    }

}
