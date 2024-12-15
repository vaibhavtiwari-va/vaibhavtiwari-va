
import java.util.LinkedList;

public class cwh_linkedlist92_java {
    public static void main(String[] args) {
        LinkedList<Integer> l1 =new LinkedList();
        LinkedList<Integer> l2= new LinkedList();
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        
       

         
        l1.add(6);
        l1.add(5);
        l1.add(7);
        l1.add(9);
        l1.addFirst(6777);
        System.out.println("add first is " +l1);
        l1.addLast(5666);
        
        
        l1.add(0,6);
       // l1.clear();
       l1.set(1, 256);
       
        

        for(int i=0; i<l1.size();i++){
            System.out.println(l1.get(i));
            System.out.println(" ,");
        }
            System.out.println("ArrayList before: "+l1);
            l1.remove(0);
            System.out.println("Array list after removing the value at index 0:" +l1);
            System.out.println("Array list contains 7:" +l1.contains(7));
            System.out.println("array list contains 4:"+ l1.contains(4));
            l1.addAll(l2);
            System.out.println(" l2 Array list is:" +l2);
            System.out.println(" l1 Array list after merging:" +l1);
            System.out.println("the first occurance of 3 in l1 is at index:"+l1.indexOf(14));
            System.out.println(l1.lastIndexOf(3));

        }
    }


    


