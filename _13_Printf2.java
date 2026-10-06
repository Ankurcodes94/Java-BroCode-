public class _13_Printf2 {

    public static void main(String[] args) {

        /*  flags   (niche 1 more)
        
        +   =   output a plus
              ,   =   comma seprate after 1000 
              (   =   negative no. enclose in () 
          space   =   display minus if negative , leave space if positive    

        */

        double price1 = 9.99 ;
        double price2 = 100.15 ;
        double price3 = -54.01 ;

        System.out.printf("% f\n" , price1);
        System.out.printf("% f\n" , price2);
        System.out.printf("% f\n" , price3);

        // WIDTH 
        // 0 = ZERO PADDING
        // NUMBER = RIGHT JUSTIFIED PADDING
        // NEG NUMBER = LEFT JUSTIFIED PADING

        int id1 = 1 ;
        int id2 = 23 ;
        int id3 = 456 ;
        int id4 = 7890 ;
        
        System.out.printf("%-4d\n" , id1);
        System.out.printf("%-4d\n" , id2);
        System.out.printf("%-4d\n" , id3);
        System.out.printf("%-4d\n" , id4);
        
    }
    
}
