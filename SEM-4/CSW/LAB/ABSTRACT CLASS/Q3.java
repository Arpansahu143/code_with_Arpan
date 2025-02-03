abstract class Person {
    abstract String getFN();
    abstract void display();
}

class Employee extends Person {
    String fn, ln;
    int empId;

    Employee(String firstName, String lastName, int employeeId) {
        this.fn = firstName;
        this.ln = lastName;
        this.empId = empId;
    }

    
    String getFN() {
        return fn + " " + ln;
    }

    
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Full Name: " + getFN());
    }
}


public class Q3 {
    public static void main(String[] args) {
        Employee emp = new Employee("shubham", "pro", 101);
        emp.display();
    }
}