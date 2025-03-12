public class demo1
{
    public static void div(int numOne,int numTwo){
    int numThree = numOne / numTwo;
     System.out.println(numThree);
    }
    public static void main(String args[]){
        int numOne=120;

        demo1 obj = new demo1();
        obj.div(120,2); 
    }
}