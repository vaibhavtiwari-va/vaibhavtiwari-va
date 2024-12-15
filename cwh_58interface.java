interface simplename{
    public void name();
    public void suggestname();
}
 interface Myname extends simplename{
    public void yourname();
    public void othername();
 }

 class anothername implements simplename{
    public void name(){
        System.out.println("vaibhav");
    }
    public void suggestname(){
        System.out.println("chinna");
    }
    public void yourname(){
        System.out.println("yadavendra");
    }
    public void othername(){
        System.out.println("akash");
    }
 }
   public class cwh_58interface {
    public static void main(String[] args) {
        anothername a=new anothername();
        a.name();
        a.othername();
        a.suggestname();
        a.yourname();

        
    }

}
