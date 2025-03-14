class Parent {
    public void add() {
        System.out.println("This is the Parent class.");
    }
}
class Third extends Parent {
    void helper() {
        System.out.println("Helper method in the Third class.");
    }
}
public class Demo {
    public static void main(String[] args) {
        int i = 0;
        while (i < 11) {
            if (i % 2 == 0) {
                if (i > 5) {
                    break;
                }
                System.out.println(i); 
            }
            i = i + 1;
        }
    }
}
