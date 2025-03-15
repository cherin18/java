class Parent {
    public void add() {
        System.out.println("HELLO WORLD");
    }
}
class Child extends Parent {
    void display() {
        add(); 
    }
}
class Third extends Parent {
    void helper() {
        add(); 
    }
}
public class Demo {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.display(); 
        Third thirdObj = new Third();
        thirdObj.helper();
    }
}
