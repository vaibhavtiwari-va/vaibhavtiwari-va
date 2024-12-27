package DataStructureAndAlgorithm;

public class Test1 {
    public static void main(String[] args) {
        int arr[]={2,4,5,67,56,48,99};
        int n=arr.length;
        int countEven=0, countodd=0;

        for(int i=0; i <n; i++){
            if((arr[i] %2)==0){
                countEven++;


                
               
            }
            else{
            countodd++;
            }
            System.out.println(+ countEven);
            System.out.println(+ countodd);
        }
    }

}
