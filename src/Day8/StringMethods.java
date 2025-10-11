package Day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome";
		//String s= new String("Welcome");
		
		//finding length of string
		int l = s.length();
		System.out.println(l);
		System.out.println("welcome".length());
		
		//concatinating two strings
		String s1= "Java";
		String s2= "Is best";
		String s3= "For learning";
		
		String s4= s1+s2;
		String s5= s1.concat(s2);
		System.out.println(s5);
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2+s3));
		
		//trimming extra spaces on right and left
		String k="   welcome   ";
		System.out.println(k);
		System.out.println(k.trim());
		System.out.println(k.length());
		System.out.println(k.trim().length()); 
		
		//CharAt() - return character from a string based on index
		
		String s6= "English";
		System.out.println(s6.charAt(4));  //u are passing index
		System.out.println(s6.charAt(0));
		
		//contains() - returns true or false
		
		System.out.println(s6.contains("lis"));
		System.out.println(s6.contains("Eng"));
		System.out.println(s6.contains("ENG"));   //False bec case sensitive"
	    System.out.println(s6.contains("Engsh")); //false, bec sequence doesn't match
	    
	    boolean bool= s6.contains("gli");
	    System.out.println(bool);
		
		//equals(), equalsIgnoreCase()
	    String s7="Amazon";
	    String s8="Flipkart";
	    String s9="amazon";
	    String s10="Amazon";
	    
	    System.out.println(s7.equals(s8)); //false
	    System.out.println(s7==s9); //false
	    System.out.println(s7.equalsIgnoreCase(s9)); //true, ignore case sensitive part
	    
	    //replace() -- replaces single or multiple characters in a sequence
	    String z="Java selenium is good as bread and butter";
	    System.out.println(z.replace('e','x'));
	    System.out.println(z.replace("selenium", "playwright"));
	    System.out.println(z.replace("selenium is", "playwright is"));
	   
	    //substring
	    z="Autonomous";
	    System.out.println(z.substring(0, 4)); //starting index starts from zero, for ending index, start counting characters from 1 
	    System.out.println(z.substring(1,4)); //ref word
	    
	    //toUpperCase()  , toLowerCase()
	    z= "Argentina";
	    System.out.println(z.toUpperCase()); //entire string becomes uppercase
	    System.out.println(z.toLowerCase()); //entire string becomes lower case
	    
	    //split()- split the string into two parts based on delimeter
	    z="kadambarisuresh17@gmail.com";
	    String a[]= z.split("@"); //now with @delimeter the sentence is split into tow, to store them we are taking single dimensional array variable
	    System.out.println(Arrays.toString(a)); //using tostring to print the array variables as such
	    System.out.println(a[0]);
	    System.out.println(a[1]);
	    
	    //example1
	     String amount="$34,15,16";   //341516
	     System.out.println(amount.replace("$", ""));
	     System.out.println(amount.replace("$", "").replace(",", ""));
	    
	     //example2
	     String m="abc@123,xyz";
	     String arr[]=m.split("@"); //abc & 123,xyz
	     System.out.println(Arrays.toString(arr));
	     
	     String arr2[]=arr[1].split(",");   //bec arr[1] contains 123,xyz
	     System.out.println(Arrays.toString(arr2));
	     
	     System.out.println(arr[0]);
	   //  System.out.println(arr[1]);
	     System.out.println(arr2[0]);
	     System.out.println(arr2[1]);
	     
	     //example 3
	     m="abc xyz 123";
	     String b[]=m.split(" ");   //splitting with space
	     System.out.println(Arrays.toString(b));
	     
	     //Cannot use * % ^ ( ) - as delimeters, more are there
	     
	     //Example4
	     String name="John Kennedy";
	     System.out.println(name.contains("john")); //false
	     //how to make it true
	     System.out.println(name.toLowerCase().contains("john"));
	     System.out.println(name.replace("J", "j").contains("john"));
	     
	    		
	    
	    
	    
	    
		
		
		
	}

}
