package Day12;
//Encapsulation example
public class Account {
    private int accno;
    private String accname;                //when u make variables private, u cant access them through objects of that class. so we use getter and setter methods to access those variables.
    private double balance;
    public int getAccno() {
        return accno;
    }
    public void setAccno(int accno) {       //setter method is used to set the value for variable as it is private.
        this.accno = accno;                 //this keyword is representing the class variable. we use it when we take the same name for local variable and class variable.
    }
    public String getAccname() {            //getter method is used to get the value of variable as it is private.
        return accname;
    }
    public void setAccname(String accname) {
        this.accname = accname;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        Account acc= new Account();
        acc.setAccno(10123);
        acc.setAccname("Kadambari");
        acc.setBalance(10000);
        System.out.println("Account number: "+acc.getAccno()+" Account name: "+acc.getAccname()+" Account balance: "+acc.getBalance());


        
    }
    



}
