 import java.util.Scanner;
import java.util.Random;
class QuickStart {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double num1;
        double num2;
        String n = "a";
      while(!n.equals("n")){  
        System.out.print("Choose whether you want to multiply (1),  divide (2), add (3), or subtract (4)");
        int divideOrMultiply = scnr.nextInt();

        if (divideOrMultiply == 1) {
            System.out.println("Next, enter the two numbers you would like to multiply: ");
             num1 = scnr.nextDouble();
             num2 = scnr.nextDouble();
            System.out.print(num1 * num2 + " is your answer");
        } 
        else if (divideOrMultiply == 2) {
            System.out.println("Next, enter the two numbers you would like to divide");
             num1 = scnr.nextDouble();
             num2 = scnr.nextDouble();
             double num3 = num1 / num2;
            System.out.print(num3 + " is your answer");
        } 
        else if (divideOrMultiply == 3) {
            System.out.println("Next, enter the two numbers you would like to add");
             num1 = scnr.nextDouble();
             num2 = scnr.nextDouble();
            System.out.print(num1 + num2 + " is your answer");
        } 
        else if (divideOrMultiply == 4) {
            System.out.println("Next, enter the two numbers you would like to subtract");
             num1 = scnr.nextDouble();
             num2 = scnr.nextDouble();
            System.out.print(num1 - num2 + " is your answer");
        } 
        else {
            System.out.println("That is not a valid answer"); 
        } 
        System.out.println(" Enter n to quit, any other character to countinue");

        n = scnr.next();
    }
}
}
}
