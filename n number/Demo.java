import java.util.Scanner;
public class Demo {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number (n):");
        int n=scanner.nextInt();
        int i=0;
        while(i<n){
            System.out.println(i);
            i=i+1;
        }
        scanner.close();
    }
}
