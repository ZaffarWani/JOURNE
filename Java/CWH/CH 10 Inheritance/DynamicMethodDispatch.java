class One{
    public void name() {
        System.out.println("name is java");
    }public void greet(){
        System.out.println("welcome");
    }
}class Two extends One{
    @Override
    public void name() {
        System.out.println("name is java 2");

    }public void greet2(){
        System.out.println("welcome 2");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // One obj = new One();
        // obj.name();
        One obj = new Two();// allowed
        //Two obj = new One();// not allowed
        obj.name();//will execute class Two
        obj.greet();

    }
    
}
