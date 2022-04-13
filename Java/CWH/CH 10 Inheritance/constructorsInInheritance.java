class Base {

    Base() {
        System.out.println("Constructor");
    }

    Base(int x) {

        System.out.println("Overloaded constructor X: " + x);
    }
}

class Derived extends Base {
    Derived() {
        // super(0);

        System.out.println("derived constructor");
    }// printing the constructors will result in printing or use of
     // base constructor as well as derived constructor
     // base will be dispalyed first

    Derived(int x, int y) {
        super(x);
        System.out.println("Overloaded derived constructor Y: " + y);
    }
}

class ChildOfDerived extends Derived {
    ChildOfDerived() {
        System.out.println("Child of derived constructor");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("Overloaded child of constructor Z " + z);
    }

}

class GrandChild extends ChildOfDerived {
    GrandChild() {
        System.out.println("Grand child ");
    }

    GrandChild(int x, int y, int z, int a) {
        super(x, y, z);
        System.out.println("Overloaded Grand CHild A; " + a);

    }
}

public class constructorsInInheritance {
    public static void main(String[] args) {
        // Base b = new Base();
        // Derived d = new Derived(14,9);
        // ChildOfDerived cd = new ChildOfDerived(12,54,2);
        //GrandChild gd = new GrandChild(21, 54, 34, 18);
    }

}
