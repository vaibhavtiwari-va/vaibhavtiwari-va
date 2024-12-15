public class cwh_80try {
    public static void main(String[] args) {
        int a=6000;
        int b=0;
        try{
        int c=a/b;
        System.out.println("the result is " + c);
        }
        catch(Exception e){
            System.out.println("this is failed to divide. Reason:");
System.out.println(e);

        }
        System.out.println("end of the programme");
    }

}
