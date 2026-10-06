import java.util.Scanner;

public class _07_ShoppingCartProgram {
    public static void main(String[] args) {

        //PROJECT-3.  SHOPPING CART PROGRAM
        
      Scanner scanner = new Scanner(System.in);

      String item ;
      double price ;
      int quantity ;
      double total;
      String currency;

      System.out.print("What item would you like to buy ? : ");
      item = scanner.nextLine();
     
      System.out.print("What is the price of the item bought ? : ");
      price = scanner.nextDouble();

     

      System.out.print("How many quantity you bought ? : ");
      quantity = scanner.nextInt();

      total = price * quantity;
      currency = "rs";
    System.out.println("You have bought " +  quantity +" "+  item + "/s");
      System.out.println("Your total is " + total+currency);



     scanner.close();    
    }



}