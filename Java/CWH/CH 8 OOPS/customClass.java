class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.print("My Name is " + name);
        System.out.print(",My ID is " + id);
        System.out.println(" And my pay is "+ salary);
    }
}
public class customClass {
public static void main(String[] args) {
// instantiating a new Employee object    
    Employee zaffar = new Employee();
    Employee aalim = new Employee();
    // setting properties/ Attributes    
    
    // zaffar 
    zaffar.name = "Zaffar Maqbool";
    zaffar.id =12;
    zaffar.salary=10000;
    //Aalim
    aalim.name = "Aalim Maqbool";
    aalim.id =3;
    aalim.salary = 4000;
// printing the properties/ Attributes    
    System.out.println(zaffar.name);
    System.out.println(zaffar.id);
    zaffar.printDetails();
    aalim.printDetails();    
}
    
}
