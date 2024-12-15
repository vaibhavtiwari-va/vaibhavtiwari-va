@FunctionalInterface
interface myfunctionalinterface{
    void thismethod();
    //void  thismethod2();
}
class newphone extends phone{
    public void showTime(){
        System.out.println("time is 8 PM");
    }
  public int sum(int a, int b){
    return a+b;
  }
}
public class cwh_108_java_annotations {
    @SuppressWarnings("Depreciation")
    public static void main(String[] args) {
        newphone phone= new newphone();
        phone.showTime();
        phone.sum(5, 07);
    }

}
