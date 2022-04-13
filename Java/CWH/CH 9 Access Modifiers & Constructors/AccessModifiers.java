class Employee{
    private int id ;
    private String name;
    
    // getters
    public String getName(){
    return name;
     }public int getId() {
        return id;
    }
    // setters
    public void setName(String n){
        name =n;
    }public void setId(int i) {
        id = i;
    }
            
        
}
public class AccessModifiers {
    public static void main(String[] args) {
        Employee zaffar = new Employee();
        //zaffar.id = 45;
        //zaffar.name = "Zaffar Maqbool";
// will throw and error due to private access modifier
        zaffar.setName("ZaffarMaqbool");
        zaffar.setId(45);
        System.out.println(zaffar.getName());
        System.out.println(zaffar.getId());
    }
    
}
