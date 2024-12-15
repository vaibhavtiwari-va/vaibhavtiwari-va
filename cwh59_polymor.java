
interface Mycamera2{
    void takesnap() ;
    void recordvideo();
    default void record4k(){
        System.out.println("recourding 4k.....");
    }
        
    }
    interface Mywifi2{
        String[] getnetworks();
        void connectnetwork(String Network);
    }
     abstract class Mycellphone2 implements Mycamera2{
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
    class Mywifiysmatphone2 extends Mycellphone2 implements Mywifi2,Mycamera2{
         public void takesnap2(){
            System.out.println("taking snap");
        }
        public void recordvideo2(){
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
    @Override
    public void takesnap() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'takesnap'");
    }
    @Override
    public void recordvideo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recordvideo'");
    }
    }

 public class cwh59_polymor {
    public static void main(String[] args) {
        Mycamera cam1= new Mywifiysmatphone();
        cam1.record4k();
        Mywifiysmatphone2 s= new Mywifiysmatphone2();
        s.callnumber(87698798);
        s.recordvideo2();
        s.getnetworks();
            
        
    }

}
    
