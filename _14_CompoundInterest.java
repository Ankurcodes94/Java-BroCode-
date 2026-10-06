import java .util.Scanner;
public class _14_CompoundInterest {
    public static void main(String[] args) {
        
        // COMPOUND INTREST CALCULATOR 

        Scanner scanner = new Scanner (System.in) ;

        double principal ;
        double rate ;
        int timescompound ;
        int years ;
        double amount ;   
        
        System.out.print("Enter the principal amount :");
        principal = scanner.nextDouble();
        
        System.out.print("Enter the intrest rate (in %) :");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the number of times compounded per year ?  :");
        timescompound = scanner.nextInt();

       System.out.print("Enter the number of years ?");
       years = scanner.nextInt();

       amount = principal * Math.pow(1 + rate / timescompound , timescompound * years);

       System.out.print("The amount after " + years + " years is : $ " + amount );

       
        


      scanner.close();
    }
    
}
