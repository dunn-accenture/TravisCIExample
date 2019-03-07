import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        while(true){
            Scanner user = new Scanner(System.in);
            FizzBuzz fizzBuzz = new FizzBuzz();
            System.out.println("Please enter a number...");
            System.out.println(fizzBuzz.process(user.nextInt()));
            System.out.println("Enter (q) to quit, enter anything else to continue");
            if(user.next().equals("q")){
                break;
            }
        }
    }
}