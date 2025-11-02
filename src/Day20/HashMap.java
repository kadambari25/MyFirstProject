/*package Day20;

import java.util.Map;
import java.util.HashMap;

public class HashMap {
    public static void main(String[] args) {
        HashMap hm1= new HashMap();
      //  Map m1= new HashMap();


        HashMap<Integer,String> hm= new HashMap<Integer,String>();
        hm.put(101,"Vaibhav");
        hm.put(102,"Vamshi");
        hm.put(103,"Ravi");
        hm.put(103,"Raju"); //duplicates not allowed
        //hm.put(key,value) :stores value in key value pair
        System.out.println(hm); //duplicate wont get printed.   //here it will get printed in list format
        
        //size
        System.out.println(hm.size());
        //removing element
        hm.remove(101); //u shud pass the key
        System.out.println(hm);

        //to get all the keys
        System.out.println(hm.keySet());
        //to get all values
        System.out.println(hm.values());
        //to get all the data
        System.out.println(hm.entrySet()); //difference between simply printing and this is, here it will getprinted as set.

        //using for each
        for(int k:hm.KeySet()){        //keyset gives the key, gets stored in k, next we are printing it, giving space, accessing the value of k
            System.out.println(k+"    "+hm.value(k));
        }

        //using iterator
        Iterator<Entry<Integer, String>>  it=hm.entrySet.Iterator();  //hm.entrySet bec it returnsfull set.
        while(it.hasNext()){
            Entry<Integer,String> entry=it.next();
            System.out.println(entry.getKey()+"     "+entry.getValue());

            hm.clear();
            hm.isEmpty();
            

        }



    }

}
*/    
