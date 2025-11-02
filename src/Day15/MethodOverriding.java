package Day15;
class Bank{
    double interestRate(){
        return 0;
    }
}

class SBI extends Bank{
    double interestRate(){      //method overriding: when a child class has a method with same name and same parameters as in its parent class but different implementation, it is called method overriding.
        return 5.5;             //even return type should be same.only implementation changes.
    }
}

class ICICI extends Bank{
    double interestRate(){      //method overriding: when a child class has a method with same name and same parameters as in its parent class but different implementation, it is called method overriding.
        return 6.5;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        SBI sbi= new SBI();
        System.out.println("SBI Interest Rate: "+sbi.interestRate());

        ICICI icici= new ICICI();
        System.out.println("ICICI Interest Rate: "+icici.interestRate());
        
    }

}
