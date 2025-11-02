package Day20;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

    //declaration
    ArrayList mylist= new ArrayList();  
    List list1= new ArrayList();   //creating object of child class for parent class reference variable

    //if u want to store homogeneous data
    ArrayList <Integer>list2= new ArrayList<Integer>(); //it will store only integer data types in this list
    ArrayList <String>list3= new ArrayList<String>(); //stores only string data type objects.
   // ArrayList <Employee>list4= new ArrayList<Employee>(); //when u want to store all the objects of employee class, u create arraylist like this

    //adding data into arraylist
    mylist.add('A');
    mylist.add(10);
    mylist.add("Simple");
    mylist.add(true);
    mylist.add("I am hungry");
    mylist.add(10.5);
    mylist.add(11111000);

    //finding size of arraylist
    System.out.println("Size of arraylist "+mylist.size());

    //printing the data from arraylist
    System.out.println("Elements in the arraylist "+mylist);    //[A, 10, Simple, true, I am hungry, 10.5, 11111000]

    //Removing element from arraylist
    mylist.remove(5); //passthe index
    System.out.println("Arraylist after removing the element "+mylist);  //[A, 10, Simple, true, I am hungry, 11111000]

    //Inserting an element, it gets inserted to 2nd position,element in second position moves to third.
    mylist.add(2,"Welcome");  
    System.out.println("Arraylist after inserting new element "+mylist);  //[A, 10, Welcome, Simple, true, I am hungry, 11111000]

    //modifying an element, gets replaced
    mylist.set(2,"I am thirsty" );
    System.out.println(mylist);        //[A, 10, I am thirsty, Simple, true, I am hungry, 11111000]

    //Accessing an element,
    System.out.println(mylist.get(3));  //Simple

    //reading elements from arraylist
    for(int i=0;i<mylist.size();i++){
        System.out.println(mylist.get(i));
    }

    //for each
    for(Object x:mylist){
        System.out.println(x);
    }

    //using iterator: it is a function that is available for arraylist
    Iterator it= mylist.iterator(); //returns iterator type value, hence we store it in iterator type variable
    while(it.hasNext()){             //has next will check if there is variable next. if it returns true,then
       System.out.println(it.next());    //it.next will store(retrieve) that value which we print, when there are no more variable has next becomes false and it stops
    }

    System.out.println(it.next()); //prints only the first value

    //Checking arraylist is empty or not
    System.out.println(mylist.isEmpty());

    //Removing multiple elements randomly from arraylist
    ArrayList mylist2= new ArrayList<>();
    mylist2.add('A');
    mylist2.add(11111000);

    mylist.removeAll(mylist2);  //removeall will take a collection as parameter, thats why when u wanna remove variables from an arraylist, create another arraylist, add the values that u wanna remove to it and then u can pass that arraylist in removeall
    System.out.println(mylist);

    //if u wanna remove all the elements
    mylist.clear();
    //clears all elements
    System.out.println(mylist.isEmpty()); //returns true




    }
}
