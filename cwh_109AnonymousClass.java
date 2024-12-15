@FunctionalInterface
interface Animal{
    void bark();
}

class Dog implements Animal{

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
}
abstract class Vehicle{
    abstract void drive();
}

@FunctionalInterface
interface Human{
    void walk();
}
@FunctionalInterface
interface LambaExp{
    void meth1(int a, int b);
}
public class cwh_109AnonymousClass {
    public static void main(String[] args) {
        Dog Bruno = new Dog();
        Bruno.bark();

        Vehicle car = new Vehicle() {
            @Override
            void drive() {
                System.out.println("I'm driving a car.");
            }
        };
        car.drive();

        Human John = new Human() {
            @Override
            public void walk() {
                System.out.println("John walks.");
            }
        };
        John.walk();

        LambaExp obj =(a,b)->{
            System.out.println("The value of a and b is : "+ a + "," + b);
        };
        obj.meth1(5,10);
    
        
        }
}
          
        
    


