package Day11;

public class GreetingsMain {
    public static void main(String[] args){
        Greetings gr= new Greetings();             //creating object of Greetings class

        gr.m1();

        String s1= gr.m2();                        //return value must be always captured, storing it in String variable as it is returning string value
        System.out.println(s1);                    //printing the value

        gr.m3("Kadambari");                   //passing the parameter value while calling the method

        String s2=gr.m4("kadambari");
        System.out.println(s2);

        //methods can be called only through objects
    }

}
