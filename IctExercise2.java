package Day3;
import java.util.Scanner;
public class IctExercise2 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Welcome to the Calculator!");
        System.out.println("Choose your option: ");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.print("Enter Choice: ");
        if(choice == 1){
            Addition();
        }
        if(choice == 2){
            Subtraction();
        }
        if(choice == 3){
            Multiplication();
        }
        if(choice == 4){
            Division();
        }
        else {
            System.out.println("Invalid choice, Choose again:");

        }
    }
    public static double Addition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number:");
        double Num1= scanner.nextDouble();
        System.out.println("Enter your Second number: ");
        double Num2 = scanner.nextDouble();
        return Num1 + Num2;

    }
    public static double Subtraction(){
return 2;
    }
    public static double Multiplication(){
return 2;
    }



    public static double Division(){
     Scanner scanner = new Scanner(System.in);
     System.out.print;n("Enter your first number");
     double Num1 = scanner.nextDouble();
     System.out.println("Enter your second number");
     double Num2 = scanner.nextDouble();

        return Num1 / Num2;
     }
    }

