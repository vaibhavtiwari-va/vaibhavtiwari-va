import javaclass.java.Main;

public class cwh_construsctor {
 int modelYear;
  String modelName;

  public cwh_construsctor (int year, String name) {
    modelYear=year;
    modelName= name;
      
    
  }
    public static void main(String[] args) {
      cwh_construsctor Mycar=new cwh_construsctor(1969,"MUSTANG");
     System.out.println(Mycar.modelYear+" "+Mycar.modelName);
        int x;
    }

  public cwh_construsctor(int y) {
    int x = y;
  }

  //public static void main(String[] args) {
   /*  cwh_construsctor myObj = new cwh_construsctor(5);
    System.out.println(myObj.x);*/
  }



       
        
    
  
  
