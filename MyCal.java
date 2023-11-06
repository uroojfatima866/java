import java.util.Scanner;

public class MyCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an expression (e.g., 5 + 10): ");
        String expression = scanner.nextLine();
        
        String[] components = expression.split(" ");
        double num1 = Double.parseDouble(components[0]);
        String operator = components[1];
        double num2 = Double.parseDouble(components[1]);
        
        double result = 0;
        
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }
        
        System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        
        scanner.close();
    }
}

