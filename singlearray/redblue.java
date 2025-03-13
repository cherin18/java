public class  redblue{
    public static void main(String args[]){
        String[] arr = {"red","blue","green"};
        for(String ball : arr){
            if(ball.equals("red") ){
                System.out.println("picked red ball");
            }
            break;
        }
    }
}