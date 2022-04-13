class EkClass{
    int a;
    public int getA(){
        return a;
    // }EkClass(int v){
    //     a = v;
    }EkClass(int a){
        this.a = a;
    }public int returnOne(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("Constructor");
    }
}



public class thisSuperKeyword {
    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        //var dc=new DoClass(6);
        System.out.println(e.getA());
    }    
}
