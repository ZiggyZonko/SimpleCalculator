import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter the operator (+, -, *, /):");
        String operator = scanner.next();

        System.out.println("Enter the second number:");
        double secondNumber = scanner.nextDouble();

        double result;

        switch (operator.toLowerCase()) {
            case "add":
            case "+":
                result = firstNumber + secondNumber;
                System.out.println("Your Equation: " + firstNumber + " + " + secondNumber + " = " + result);
                break;
            case "subtract":
            case "minus":
            case "-":
                result = firstNumber - secondNumber;
                System.out.println("Your Equation: " + firstNumber + " - " + secondNumber + " = " + result);
                break;
            case "multiply":
            case "times":
            case "*":
                result = firstNumber * secondNumber;
                System.out.println("Your Equation: " + firstNumber + " * " + secondNumber + " = " + result);
                break;
            case "divide":
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Error: Cannot divide by zero");
                } else {
                    result = firstNumber / secondNumber;
                    System.out.println("Your Equation: " + firstNumber + " / " + secondNumber + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
