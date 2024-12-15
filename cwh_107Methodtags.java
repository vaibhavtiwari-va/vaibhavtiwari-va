/**
 * @param args
 
 * 
 */
public class cwh_107Methodtags {
    public static void main(String[] args) {
        System.out.println("I am main method");

        
    }
    /**
     *  @param i
     * @param j
     * @return 
     * @throws
     */
     public int add(int i, int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
         c = i+j;
         return c;
     }

}
