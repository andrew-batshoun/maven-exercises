import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.*;

public class DependencyManagementExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String inputString = scan.nextLine();
        System.out.println("You've entered: " + inputString);
        if(isNumeric(inputString)){
            System.out.println(inputString + " is a number.");
        }else{
            System.out.println(inputString + " is not a number.");
        }
        System.out.println("Flipped Case: " + swapCase(inputString));
        System.out.println("Reversed: " + reverse(inputString));
    }
}
