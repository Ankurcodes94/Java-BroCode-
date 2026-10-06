import java.util.Scanner;
public class _18_WeightConvertor {
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);


      // WEIGHT CONNVERSION PROGRAM 
      // 1. DECLARE VARIABLES 
      // 2. WELCOME MSG
      // 3. PROMPT FOR USER INPUT
      // 4. OPTION 1 = COVERT LBS TO KGS
      // 5. OPTION 2 = CONVERT KGS TO LBS
      // 6. ELSE PRINT NOT A VALID CHOICE

     double weight ; 
     double newweight ; 
     int choice ; 

     System.out.println("Weight conversion program");
     System.out.println("Option 1 : kgs to lbs");
     System.out.println("Option 2 : lbs to kgs");

     System.out.print("enter your choice :");
     choice = scanner.nextInt();

    if(choice==1){

        System.out.print("Please enter you weight in kgs : ");
        weight = scanner.nextDouble();

        newweight = weight * 2.20462 ;

        System.out.printf("The new weight in lbs is : %.2f" , newweight);
    
    }
    else if(choice==2){


         System.out.print("Please enter you weight in lbs : ");
        weight = scanner.nextDouble();

        newweight = weight * 0.453592 ;

        System.out.printf("The new weight in kgs is : %.2f" , newweight);
    



    }
    else{
         System.out.print("Please chosse a valid choie : ");
  

    }



     scanner.close();
    }
    
}
