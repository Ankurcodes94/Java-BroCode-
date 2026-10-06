import java.util.Scanner;


// GETTING INPUT FROM USER IN  INT , STR , BOOLEAN , DOUBLE



public class _03_GettingInputFromUser  {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter your name : ");

        String name = scanner.nextLine();

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa : ");
        double gpa = scanner.nextDouble();

        System.out.print("are you a student ? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("My age is " + age + " years old");
        System.out.println("you gpa is  " + gpa + " in first sem ");

        if(isStudent){

            System.out.println("you are a student ");
        }
        else{
            System.out.println("you are not a student");
        }



    // COMMON ERRORS :  IF WE USE INT OR STR OR DOUBLE AND USE STR AND INT AFTER IT WE
    //  WILL GET ERROR SAYING IDK EXAMPLE TO FIX THAT WRITE 
    // scanner.nextint,line,boolean(); do this and dont assign any value 
    
    scanner.close();

    }

}