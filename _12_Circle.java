import java.util.Scanner;
public class _12_Circle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double radius ; 
        double circumference ; 
        double volume ;
        double area ;

        System.out.print("What is the value of radius ? ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius ;
        area = Math.PI * Math.pow(radius , 2);
        volume = (4.0/3.0)* Math.PI * Math.pow(radius , 3);


        //System.out.println("The value of circumference is : " + circumference + " cm ");
        //System.out.println("The value of area is : " + area + "cm^2");
        //System.out.println("The value of volume is : " + volume + "cm^3");


        // PRINT F 
        System.out.printf("The value of circumference is : %.1fcm\n " , circumference);
        System.out.printf("The value of area is : %.1fcm^2\n" , area );
        System.out.printf("The value of volume is : %.1fcm^3\n" , volume) ;


     scanner.close();
    }
}
