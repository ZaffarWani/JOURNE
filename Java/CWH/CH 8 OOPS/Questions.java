 //Q1
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}


    // Q2 class cell phone with prop

class CellPhone{
    public void ringing(){
        System.out.println("ringing");
    }
    public void vibrating(){
        System.out.println("vibrating");
    }
} 

    // Q3 class square with methods to initialize its side,calculating area,perimeter etc
class Square{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4*side;
    }

}    

// Q4
class Rectangle{
    int lenght;
    int width;
    public int perimeter(){
        return 2*(lenght + width);
    }
    public int area(){
        return width*lenght;
    }
    
    

}

//Q5
class Tommy{
    public void hit() {
        System.out.println("hitiing");
    }
    public void run(){
        System.out.println("Running");
    }public void fire() {
        System.out.println("fire..fire..fire");
        
    }
}













public class Questions {
    public static void main(String[] args) {
        // Q1
        Employee zaffar = new Employee();
        zaffar.setName("ZAffarMaqbool");
        zaffar.salary=10000;
        System.out.println(zaffar.getName());
        System.out.println(zaffar.getSalary());
        
        //Q2
        CellPhone asus = new CellPhone();
        asus.vibrating();
        asus.ringing(); 
         // Q3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
         
         // Q4
        Rectangle rc = new Rectangle();
        rc.lenght = 3;
        rc.width =4;
        System.out.println(rc.perimeter());
        System.out.println(rc.area());
        // Q5
        Tommy tm = new Tommy();
        tm.run();
        tm.fire();
        tm.hit();
        
    }

    
}
