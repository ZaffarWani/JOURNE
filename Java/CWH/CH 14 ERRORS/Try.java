public class Try {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try{
            int c = a/b;
            System.out.println(c);
        }catch(Exception e){
            System.out.println("Cant Divide By 0");
            System.out.println(e);

        }
    }
}
