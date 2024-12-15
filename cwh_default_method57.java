interface Mycamera{
    void takesnap() ;
    void recordvideo();
    default void record4k(){
        System.out.println("recourding 4k.....");
    }
        
    }
    interface Mywifi{
        String[] getnetworks();
        void connectnetwork(String Network);
    }
    class Mycellphone{
        void callnumber(int phonenumber){
            System.out.println("calling"+ phonenumber);
        }
        void pick(){
            System.out.println("connecting....");
        }
      //  void takesnap(){
          //  System.out.println("Taking snap");
        //}
    }
    class Mywifiysmatphone extends Mycellphone implements Mywifi,Mycamera{
         public void takesnap(){
            System.out.println("taking snap");
        }
        public void recordvideo(){
            System.out.println("taking snap");
    }
    public void record4k(){
        System.out.println("recording in 4k ....ok");
    }
    public String[] getnetworks(){
        System.out.println("Getting list of networks");
        String [] networklist={"harry", "anjali5g", "prashant"};
        return networklist;
    }
    public void connectnetwork(String network){
        System.out.println("connecting to" + network);
    }

    

public class cwh_default_method57 {
    public static void main(String[] args) {
        Mywifiysmatphone ms=new Mywifiysmatphone();
        ms.record4k();
        String [] ar= ms.getnetworks();
        for(String item: ar) {
            System.out.println(item);
        }
        
    }

}
    }