class DemoParent {
    public void add() {
        System.out.println("This is the Parent class.");
    }
}
class DemoChild extends DemoParent {  
    void display() {
        System.out.println("hello");
    }
}
class AnotherDemoChild extends DemoParent {
    void display() {
        System.out.println("home");
    }
}
public class Demo {
    public static void main(String[] args) {
        DemoChild obj1 = new DemoChild(); 
        obj1.display(); 
        AnotherDemoChild obj2 = new AnotherDemoChild(); 
        obj2.display();
    }
}
