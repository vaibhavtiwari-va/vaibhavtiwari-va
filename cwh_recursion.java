class GFG {
    //recursive method
    int fact(int n ) {

        int result;

        if(n==1) 
        return 1;
        result=fact(n-1)*n;
        return result;
    }
    
}
public class cwh_recursion {
    public static void main(String[] args) {
      /*  int result =sum (5,10) ;
        System.out.println(result);
    }
    public static int sum (int start,int end) {
        if (end >start) {
            return end +sum (start,end -1);
        } else {
            return end ;*/
         /*  int result =sum (10);
            System.out.println(result);
        }
        public static int sum (int k) {
            if (k>0) {
                return k+sum (k-1);
            } else {
                return 0;*/
                
                 GFG f=new GFG();
                 System.out.println("the factorial 3 is" +f.fact(3));
                 System.out.println("the factorial 4 is" +f.fact(4));
                 System.out.println("the factorial 5 is" +f.fact(5));


{
                
            }


    
    }
        }
    
    

