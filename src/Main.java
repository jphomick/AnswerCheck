import java.util.Scanner;
public class Main {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How is the weather?");
        String answer = sc.nextLine().trim();

        if (answer.contains("rain"))
            System.out.println("Take your umbrella!");
        else if (answer.contains("windy"))
            System.out.println("Wear your jacket!");
        else if (answer.contains("snow") )
            System.out.println("Wear a coat and take a shovel!");
        else if (answer.contains("stormy") )
            System.out.println("Stay inside and watch the downpour!");
        else
            System.out.println("Enjoy your day!");
    }
}
