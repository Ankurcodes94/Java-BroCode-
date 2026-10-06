 public class _02_DataTypes {

           // data types


    public static void main(String[] args) {
        int age = 20;
        int year = 2007;
        System.out.println("my age is "+ age );
        System.out.println("i was born in "+ year);


        double cgpa = 9.89;
        double price = 310000.99;
        System.out.println("my cgpa is "+ cgpa);
        System.out.println("gas prices are "+ price);


        char grade = 'a';
        char symbol = '&';  
        char currency = '$';
        System.out.println("my grade is "+ grade);
        System.out.println("currency in US is "+ currency);
        System.out.println("my new symbol is : " + symbol);


        boolean isStudent = false;
        boolean forSale = true;
        System.out.println(isStudent);
        System.out.println(forSale);

        // if else statement using boolean finish them later

        if(isStudent){

            System.out.println("you are a student ");

        }
        else{

        System.out.println("you are not a student ");
        }


        String name = " Ankur Yadav ";
        String email = "ankur.codes94@gmail.com";
        

        System.out.println("you are brilliant " + name);
        System.out.println("my gmail is " + email);
        System.out.println("you are " + name);
        System.out.println("you are " + age + " years old " + "as of " + year + " and your grade is " + grade);


    }

}