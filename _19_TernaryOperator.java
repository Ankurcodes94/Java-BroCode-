public class _19_TernaryOperator {
    public static void main(String[] args) {

        // ternary operator ? = Return 1 of 2 values if cond true 
        // variable = (condition) ? if true : if false

        int score = 59 ;
        int number = 34 ; 
        int hours = 13 ;
        int income = 60000 ; 
        
        if(score>=60){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
 
        String passOrfail = (score>=60) ?"pass":"fail";
        System.out.println(passOrfail);

        String evenOrodd = (number % 2 == 0) ? "even":"odd";
        System.out.println(evenOrodd);

        String timeofday = (hours<12)? "Am":"Pm";
        System.out.println(timeofday);

        double taxrate = (income>=40000)?0.25:0.15;
        System.out.println(taxrate);

    }
}
