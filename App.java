import java.util.Scanner;

public class App {
    private static final Scanner inputScanner = new Scanner(System.in);
    
    public static void main(String [] args){

        Calculator cal = new Calculator();
        boolean keepGoing = true;

        //string operation = menu(
        //if operation.equals("exit")
        //return;
        //another way to put the menu and if they type something wrong it will continue to repeat the menu until they type 'exit'
        while(keepGoing){//so if we add this to the while statement should run might have to change around variables
        
        
        String whichOperation = getString("Which process would you like to complete: \nadd: \nsubtract: \nmultiply: \ndivide:");


        double num1 = getDouble("Enter your first number: ");
        double num2 = getDouble("Enter your second number: ");
        // System.out.println(String.format("You want to add " + num1 + " and "+ num2 ));

        switch (whichOperation) {
            case "add":
                System.out.println(cal.add(num1, num2));  // or  result = cal.add(num1, num2)
                break;
            case "subtract":
                System.out.println(cal.sub(num1, num2));
                break;
            case "multiply":
                System.out.println(cal.mult(num1, num2));
                break;
            case "divide":
                System.out.println(cal.divide(num1, num2));
                if (num1 == 0){
                    System.out.println("Cannot divide by ZERO DUMMY! Try again type 'Yes ' ");
                }
                if (num2 == 0){
                    System.out.println("Cannot divide by ZERO DUMMY! Try again type 'Yes ' ");

                }else {

                }
                break;
            default:
                System.out.println("Please enter of the operations");
//? you could thorw new like the project UnsupportedOperationException(this blah blah)
        }

        // this would not work with the if statements if else would have fixed it


        // if (whichOperation == "Add"){
        //     System.out.println(cal.add(num1, num2));
        // }
        // if (whichOperation == "Subtract"){
        //     System.out.println(cal.sub(num1, num2));
        // }
        // if (whichOperation == "Multiply"){
        //     System.out.println(cal.mult(num1, num2));
        // }
        // if (whichOperation == "Divide"){
        //     System.out.println(cal.divide(num1, num2));
        // }



        // System.out.println(String.format("You want to add " + num1 + " and " + num2 ));
        // System.out.println(cal.add(num1, num2));
        // System.out.println(String.format("You want to subtract " + num1 + " and " + num2 ));
        // System.out.println(cal.sub(num1, num2));
        // System.out.println(String.format("You want to multipy " + num1 + " and " + num2 ));
        // System.out.println(cal.mult(num1, num2));
        // System.out.println(String.format("You want to divide " + num1 + " and " + num2 ));
        // System.out.println(cal.divide(num1, num2));
        
        String result = getString("Do you wish to continue, please enter Yes or No: ");

        if(result.equals("Yes")){
            keepGoing = true;
        }
        else {
            System.out.println("Goodbye");
            keepGoing = false;
        }
    }
    }

    private static String getString(String prompt) {
        System.out.println(prompt);
        return inputScanner.next();
    }
    private static double getDouble(String prompt) {
        System.out.println(prompt);
        return inputScanner.nextDouble();

    }

    //so we have to add a method to the keepgoing like add a list<string> options list.of("'add", )

 
}


// 