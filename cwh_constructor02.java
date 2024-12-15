class Base1{
    Base1(int a) {
        System.out.println("i am a constructor with avalue a as"+a);
    }
    

}

 class Derived1 extends Base1{
    Derived1(){
       super(0);
        System.out.println("i am a derived class");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("i am aderived class ovrerloaded y as"+y);
    }
 }

public class cwh_constructor02 {
    public static void main(String[] args) {
       // Base1 b = new Base1();
    // Derived1 d =new Derived1();
    Derived1 d= new Derived1(4,7);
        
    }

}
