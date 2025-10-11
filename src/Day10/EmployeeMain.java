package Day10;

public class EmployeeMain {

	public static void main(String[] args) {  //we can have one main class that contains main method and multiple other classes, But we can execute only from main class.
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

//In real time, projects this is how they operate, one main class and multiple other classes.
//if u are class is in a different package, then u need to import the package to the main class and run the main method.

//Once object is created, it will have all the properties of the class, it can access everything from the class.
