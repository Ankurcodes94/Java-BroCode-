import java.util.Scanner;

public class _04_CalculateAreaOfTriangle {
    public static void main(String[] args) {
        
          //     PROJECT - 1. CALCULATE AREA OF A RECTANGLE

          double area = 0;

          Scanner scanner = new Scanner(System.in);

          System.out.print("enter width : ");
          double width = scanner.nextDouble();
       

          System.out.print("enter height : ");
           double height = scanner.nextDouble();
           area = (height * width);
          System.out.println(height * width);
         

          System.out.println("Area of rectangle is :" + area + " cm^2 " );

          scanner.close(); 
       

    
    }

}
