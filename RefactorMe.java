
package refactor.me;
import java.util.*;
import java.util.Scanner;
public class RefactorMe {

    public static void main(String[] args) {
        getName();
        calculateSalary(2500, 400);
        calculateSides("circle");
        countLetters();
    }

    public static void getName(){
        Scanner in = new Scanner(System.in);
        System.out.println("Your age is: ");
        String Name = in.nextLine();
        System.out.println("Your age is: " + Name);
    }

    public static void calculateSalary(int income, int tax) {
        // Salary = income - tax
        System.out.println("Your salary is: " + (income - tax));
    }

    public static void calculateSides(String shape) {
        // this method should detect for
        // 1 square
        // 2 circle
        // 3 hexagon
        // 4 dodecagon
       
        if (shape.contains("square")) {
            System.out.println("Your shape has 4 sides");
        }
        
        if (shape.contains("circle")){
            System.out.println("Your shape has 1 side");
        }
        
        if (shape.contains("hexagon")){
            System.out.println("Your shape has 6 sides");
        }
        
        if(shape.contains("dodecagon")){
            System.out.println("Your shape has 12 sides");
        }
    }

    public static void countLetters() {


        //String word = 
        Scanner inn = new Scanner (System.in);
        System.out.println("What is your word? ");
        String word = inn.nextLine();
        System.out.println("You entered: " + word );

        System.out.println("You word is: " + word.length() + " letters long.");
    }

}


    

