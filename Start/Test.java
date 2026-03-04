class Person {
    private int age;
    private String name;

    public void setage(int ag) {
        age = ag;
    }

    public void setname(String nm) {
        name = nm;
    }

    public int getage() {
        return age;
    }

    public String getname() {
        return name;
    }
}

class Employee extends Person {
    private String empID;

    public void setempID(String emp) {
        empID = emp;
    }

    public String getempID() {
        return empID;
    }
}

public class Test {
    public static void main(String[] args) {
        Employee edata = new Employee();
        edata.setname("John");
        edata.setage(46);
        edata.setempID("emp1901");

        System.out.println("Name: " + edata.getname());
        System.out.println("Age: " + edata.getage());
        System.out.println("Employee ID: " + edata.getempID());
    }
}