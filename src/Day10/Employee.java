package Day10;

public class Employee {
	
	int id;									//variables
	String name;
	String job;
	int sal;
	
	void display() {                        //method.//using void because display has no return type. otherwise u shud mention the return type like string, int etc
		System.out.println(id);
		System.out.println(name);
		System.out.println(job);
		System.out.println(sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();		//object can be created only inside main method
		emp1.id=101;
		emp1.name="Ramesh";
		emp1.job="Manager";
		emp1.sal=50000;
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.id= 102;
		emp2.name="Suresh";
		emp2.job="Supervisor";
		emp2.sal=30000;
		emp2.display();
		System.out.println(emp2.id); //if display method didn't exist ,then u can directly print the values as well.
		
	}

}

//Employee class has two methods, one default method that is main method and another method we created 
