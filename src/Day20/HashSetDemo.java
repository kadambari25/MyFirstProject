package Day20;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet hs= new HashSet();
        Set hs1= new HashSet();

        HashSet <Integer>sh3= new HashSet<Integer>();

        //adding elements into hashset
        hs.add("Ariv");
        hs.add(100);
        hs.add(1100000);
        hs.add(10.5);
        hs.add(true);
        hs.add('A');
        hs.add("I am alright");
        hs.add(100); //duplicates not allowed, still adding , observe output
        hs.add(null);
        hs.add(null); //multiple nulls not allowed, still adding

        System.out.println("elements in the set "+hs);   //[1100000, null, Ariv, A, 100, 10.5, I am alright, true] : only one null will be printed and the duplicate wont be printed

        //size of hashset
       System.out.println(hs.size()); 

       //removing single element
       hs.remove("I am alright"); //need to pass value as indexing is not supported
       System.out.println(hs);

        //accessing single element is not possible because there is no indexing concept here
        //Inserting is also not possible for the same reason

        //removing element from the hashset
        //since it doesnt support indexing, it is difficult to remove the element that we want, so first convert to arraylist

        ArrayList alistt1= new ArrayList(hs);
        System.out.println(alistt1);
        alistt1.remove(3); //removing third element from array list
        System.out.println(alistt1);

        //can use for each loop for reading all elements
        for(Object s:hs){
            System.out.println(s);
        }

        Iterator it10= hs.iterator();
        while (it10.hasNext()) {
           System.out.println(it10.next()); 
            
        }

        hs.clear();
        System.out.println(hs.isEmpty());

    



        




        
    }
}
