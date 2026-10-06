import java.util.Scanner;

public class _21_EnhancedSwitches {
    public static void main(String[] args) {

        // ENHANCHED SWITCH = A REPLACEMENT TO USE MANY ELSE IF STATEMENTS (JAVA14 FEATURE)

    Scanner scanner = new Scanner(System.in);


    String day ;


    System.out.print("Enter the day of the week : ");
    day = scanner.nextLine();



    switch(day){

        // CAN ALSO PUT MONDAY TO FRIDAY AND SATURDAY TO SUNDAY

      case "monday" ->System.out.println("Its a weekday");
      case "tuesday" ->System.out.println("Its a weekday");
      case "wednesday" ->System.out.println("Its a weekday");
      case "thursday" ->System.out.println("Its a weekday");
      case "friday" ->System.out.println("Its a weekday");
      case "saturday" ->System.out.println("Its a weekend");
      case "sunday" ->System.out.println("Its a weekend");
      default ->System.out.println("Its not a day");
    }

    
   
   
   
   scanner.close();
    }
    
}
