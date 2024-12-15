/*interface animal{
    public void animalsound();
    public void sleep();
}
  class pig implements animal{
    public void animalsound(){
        System.out.println("pig says:wee wee");
    }
    public void sleep(){
        System.out.println("sounds: zzzz");
    }
    

  }*/
  interface maininterface{
    public void method(); // interface method

    
  }
  interface secondinterface{
    public void method2(); // interface method
  }

  // democlass "implements" maininterface and secondinterface
  class democlass implements maininterface ,secondinterface{
    @Override
    public void method(){
        System.out.println("some text");
    }

    @Override
    public void method2() {
        System.out.println("some other text");
        
       
    }
  }
   public class interface58 {
    public static void main(String[] args) {
        democlass a2=new democlass();
        a2.method();
        a2.method2();
       
    }

}
