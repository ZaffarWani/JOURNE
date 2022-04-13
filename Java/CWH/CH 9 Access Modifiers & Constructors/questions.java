// Q1 create a cylinder class with radius 
//and height with getter and setter
class Cylinder{
    private int radius;
    private int height;

    public  Cylinder(){
        radius= 4;
        height =5;
    }
    public double surfaceArea(){
        return 2 *Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }

    public int getHeight(){return height;}
    public int getRadius(){return radius;}
    public void setHeight(int h){height =h;}
    public void setRadius(int r){radius =r;}
}
public class questions {
    public static void main(String[] args) {
        // Q1
        Cylinder cy = new Cylinder();
        System.out.println(cy.getHeight());
        System.out.println(cy.getRadius());
    // Q2
        System.out.println(cy.surfaceArea());
        System.out.println(cy.volume());
    }
    
}
