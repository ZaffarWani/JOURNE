

//Q1
abstract class Pen {
    abstract void write();

    abstract void refil();
}

// Q2
class FountainPen extends Pen {
    void write() {
        System.out.println(" Writing");
    }

    void refil() {
        System.out.println(" Refilling");
    }

    void ChangeNib() {
        System.out.println(" Q1+Q2:Changing Nib");
    }
}// Q3
// Q3
class Monkey {
    void jump() {
    };

    void bite() {
    };
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    public void jump() {
        System.out.println("I Learned To Jump");
    }

    public void bite() {
        System.out.println(" Q3: I am Biting");
    }

    public void eat() {
        System.out.println("I Am Eating");
    }

    public void sleep() {
        System.out.println("Sleeping Is Very Important");
    }

    public void Speak() {
        System.out.println("I Can Speak");
    }

}
// Q4
abstract class Telephone {
    abstract public void ring();

    abstract public void lift();

    abstract public void disconnect();

}

class SmartPhone extends Telephone {
    public void ring() {
        System.out.println("RIng");
    }

    public void lift() {
        System.out.println("Lift");
    }

    public void disconnect() {
        System.out.println("Diconnecting");
    }
}
// Q5
interface SmartRemote{
    void ar(int change);
    void touch(int fast);
}
class Bot{
    void auto(){}
    
}
class TvRemote  implements SmartRemote{
    public void ar(int fast){}

    
    public void touch(int change){}
    

}
public class Questions {
    public static void main(String[] args) {
        // Q2
        FountainPen fn = new FountainPen();
        fn.ChangeNib();
        // Q3
        Human h = new Human();
        h.bite();
        TvRemote tv = new TvRemote();
        tv.touch(5);
    }
}
