public class Demo
{
    public static void div(int numOne,int numTwo){
    int numThree = numOne / numTwo;
     System.out.println(numThree);
    }
    public static void main(String args[]){
        int numOne=120;

        Demo obj = new Demo();
        obj.div(120,2); 
    }
}