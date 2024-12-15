class employee {
   /*  int id;
    String name;
    public void details() {
        System.out.println("my id is"+ id);
        System.out.println("and my name is"+ name);
    }*/
    //identity
    int id;
    //salary
     int salary;
     //string name
     String Name;
     public void printdetails(){
// print and display details
     System.out.println("My id is" + id);
System.out.println("this is my name" + Name); 


    
     
    

    
    }
     {
        
    }

}
public class cwh_custom_class {

    public static void main(String[] args) {
      /*  System.out.println("This is our custom class");
        employee vaibhav= new employee ();
        employee johan= new employee ();
        vaibhav.id=12;
        vaibhav.name="codewithvaibhav";
        johan.id=17;
        johan.name="codewithjohan";
        vaibhav.details();
        johan.details();*/
      //  System.out.println(vaibhav.id);
      //  System.out.println(vaibhav.name);

// print and display command
        System.out.println("this is the custom class");
        employee harry= new employee();
        employee robin=new employee();
        
        harry.id=25;
        harry.salary=1000000;
        harry.Name="amit tripathi";

        robin.id=23;
        robin.salary=78000;
        robin.Name="vaibhav tiwari";

        harry.printdetails();
        robin.printdetails(); 

         int salary=robin.salary;
           System.out.println("salary of robin:"+ salary+"$");
        System.out.println("id:"+ harry.id);

    }

}

