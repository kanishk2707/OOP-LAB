
class Person{
    private int age;
    private String name;
    public void setage(int ag){
        age=ag;
    }
    public void setname(String na){
        name=na;
    }
    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }
}
class Employee extends Person{
    private String empID;
    public void setempID(String id){
        empID=id;
    }
    public String getempID(){
        return empID;
    }

}
public class EmpData{
    public static void main(String args[]){
        Employee obj=new Employee();
        obj.setname("kk");
        obj.setage(18);
        obj.setempID("akekjdfkda");
        System.out.println(obj.getname()+obj.getage()+obj.getempID());
    }
}
