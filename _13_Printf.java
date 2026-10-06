public class _13_Printf {
    public static void main(String[] args) {

        // PRINTF = A METHOD USED TO FORMAT OTPUT
        // %[FLAGS][WIDTH][.PRECISION][SPECIFIER-CHARACTER]
        // NICHE 1 MORE

        String name = "krishna" ;
        int age = 20 ;
        boolean isStudent = true ; 
        double height = 5.11 ; 
        char firstLetter = 'k' ; 

        
        System.out.printf("Hello %s \n" , name );
        System.out.printf("Your name starts with %c\n" , firstLetter );
        System.out.printf("Your age is %d\n " , age );
        System.out.printf("Are you a : %b \n" , isStudent);
        System.out.printf("Your height is : %.1f inches tall \n" , height );
        System.out.printf("Is student : %b\n" , isStudent);
        
        System.out.printf("%s is x%d years old and a %b student " , name , age , isStudent); 
        
       

       
         
       

    }
    
}
