import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        double numberOne = 0.0;
        double numberTwo = 0.0;
        double result;
        boolean input = false;

        Scanner scanner = new Scanner(System.in);

        while(!input){
            try {
            System.out.println("Enter first number: ");
            numberOne = scanner.nextDouble();
            
            input = true;
            
            } catch (InputMismatchException e) {
                
                System.out.println("Please enter a valid value... ");
                scanner.nextLine();   
            }
            
        }
        input = false;
        while(!input){
            try {
            System.out.println("Enter second number: ");
            numberTwo = scanner.nextDouble();
            input = true;
            
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid value.... ");
                scanner.nextLine();
            }

        
        }
           
        
        System.out.println("Enter operator ('-' or '/'); ");
        char operator = scanner.next().charAt(0);
        while(true){
            if(operator == '-' ){
                result = numberOne - numberTwo;
                System.out.println("The result is "+result);
                break;

            }else if (operator == '/'){
                result = numberOne / numberTwo;
                System.out.println("The result is "+result);
                break;

            }else {
                System.out.println("Invalid operator");
                operator = scanner.next().charAt(0);
                continue;
            }

        }
        

    }

}
