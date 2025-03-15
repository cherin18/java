public class Demo {
    void add(int a, int b) {
        System.out.println("Answer is " + (a + b)); 
    }
    void add(int a, int b, int c) {
        System.out.println("Answer is " + (a + b + c)); 
    }
    public static void main(String args[]) {
        Demo obj = new Demo(); 
        obj.add(10, 20); 
        obj.add(20, 30, 40); 
    }
}
