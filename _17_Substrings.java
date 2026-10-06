import java.util.Scanner;
public class _17_Substrings{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    String email ;
    String username ;
    String domain ;

    System.out.print("Enter your email : ");
    email = scanner.nextLine();

    if(email.contains("@")){

         domain = email.substring(email.indexOf("@")+1);
         username = email.substring(0,email.indexOf("@"));

         System.out.println(email);
         System.out.println(domain);
         System.out.println(username);

    }
    else{
        System.out.println("Please enter a valid email");
    }



        
     /*  
     String email = "ankur.codes@gmail.com";
     String username = email.substring(0,7);
     String domain = email.substring(12);
    String username1 = email.substring(0 ,email.indexOf("@"));
     String domain1 = email.substring(email.indexOf("@")+1);

     System.out.println(username);
     System.out.println(domain);
     System.out.println(username1);
     System.out.println(domain1);
     
     */







     scanner.close();

  

        



    }
    
}