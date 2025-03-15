import java.util.*;
public class Demo {
    public static void main(String args[]) {
        String v[] = {"a", "e", "i", "o", "u"};
        Scanner input = new Scanner(System.in);     
        System.out.print("Enter a character: "); 
        String answer = input.nextLine();       
        int detect = 0;
        int i = 0;        
        while (i <= 4) {
            if (answer.equals(v[i])) {
                detect = 1;
                break;
            }
            i = i + 1;
        }        
        if (detect == 1) {
            System.out.println("vowel");
        } else {
            System.out.println("not a vowel");
        }
        input.close();
    }
}
