import java.util.Scanner;
public class _11_Hypotenus {
    public static void main(String[] args) {
        
        // HYPOTENUS FOR A TRIANGLE 

        Scanner scanner = new Scanner(System.in);

        double hypotenus ;
        double perpendicular ;
        double base ;

        System.out.print("What is the length of base ? ");
        base = scanner.nextDouble();

        System.out.print("What is the length of perpendicular ? ");
        perpendicular = scanner.nextDouble();

        //hypotenus = base*base + perpendicular*perpendicular ;
         hypotenus = Math.sqrt(Math.pow(base , 2) + Math.pow (perpendicular , 2));

        System.out.print( "The length of hypotenus is " + hypotenus + " cm");


    scanner.close();

    }
    
}
