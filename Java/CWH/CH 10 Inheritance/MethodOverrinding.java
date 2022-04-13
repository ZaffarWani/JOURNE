class A {
    public int a;

    public int zaffar() {
        return 4;
    }

    public void meth2() {
        System.out.println("i am meth 2 A");
    }
}

class B extends A {
    // Override
    // we use @override to check something in ooveriding has been chnage dor nor
    // if anything will be changed in parent class or derived class
    // which ws supposed to be overrided but now it has
    // been changed, now the code will throw an error
    // it will only not throw error if it satisfies
    // overrinding properties
    @Override
    // not needed but recomended
    public void meth2() {
        System.out.println("i am meth 2 B");
    }

    public void meth3() {
        System.out.println("i am meth 3 ");
    }
}

public class MethodOverrinding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
