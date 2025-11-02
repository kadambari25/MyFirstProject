package Day19;

public class TypeCastingObjects3 {
    public static void main(String[] args) {

        Object o = new String("welcome");
        StringBuffer sb= (StringBuffer)o; //rule3 failed
//          A        B        C        D
        //RULE 1: C and D must be related.
      //  Stringbuffer is the child class of Object class, so C and D are related.
      //Rule 2: B must be same as C or parent of C.
        //B is same as C, so this condition is satisfied.
    //Rule 3: The underlying object of o is String, but String and StringBuffer are unrelated classes.
        //so this line throws ClassCastException at runtime as o is referring to String object, which is not related to StringBuffer class.

        //Example 2:
        String s= new String("welcome");
 //       StringBuffer sb= (StringBuffer)s; // Rule 1 only failed
    //          A        B        C        D
        //RULE 1: C and D must be related.
      //  Stringbuffer is not related to String class, so this line throws compile time error.

      //Example3:
      Object o1= new String("welcome");
    //  StringBuffer sb1= (String)o1; //rule 2 failed as C and B are not same type nor B is not the parent of C.

    //ex4:
    String s1= new String("welcome");
  //  StringBuffer sb= (String)s;  //rule 2 failed as B and C are not same nor has parent child relationship.

  //ex5:
  Object o2= new String("Welcome");
  StringBuffer sb1= (StringBuffer) o; //rule 3 failed

  //ex6:
  Object o5= new String("welcome");
  String s6= (String)o5;   //all three rules satisfied.




    }

}
