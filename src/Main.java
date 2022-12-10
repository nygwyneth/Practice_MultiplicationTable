import java.util.*;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        startProgram();
    }
    
    public static void startProgram() {
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        
        displayMultiplicationTable(number);
    }
    
    public static void displayMultiplicationTable(int number) {
        for(int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " x " + i + " = " + product);
        }
    }
}