class Employee{
    private int id;
    private String name;
    // public Employee(){
    //     id = 45;
    //     name = "Aalim";
    public Employee(String myname){
        id = 45;
        name = myname;   
        
    }

    public String getName(){return name;}
    public int getId(){return id;}
    public void setName(String n){ name =n;}// can use this.name =n also
    public void setId(int i){id = i;}
}

public class Constructors {
    public static void main(String[] args) {
        Employee zaffar = new Employee("zaffar mabqool");
        // zaffar.setName("Zaffar Maqbool");
        // zaffar.setId(45);
        System.out.println(zaffar.getName());
        System.out.println(zaffar.getId());
    }
}
