public class _06_ArithmeticOperators {

    public static void main(String[] args) {
        

        // ARITHEMATIC OPERATORS

        int a = 10;
        int b = 9;
        int z ;

       //z = a+b;
       //z = a*b;
       //z = a-b;
       //z = a/b;
       z = a%b;

        System.out.println(z);


        // AUGMENTED ASSIGNMENT OPERATORS

       // a+=b;
       // a-=b;
       // a*=b;
       // a/=b;
       // a%=b;
        System.out.println(a);

        // INCREMENT AND DECREMENT OPERATORS

        a++;
        a++;
        a++;
        a--;
        a--;
        a--;

        System.out.println(a);

        // ORDER OF OPERATORS [ P - E - M - D - S - S ]

        double result = 3 + 4 *( 7 - 5 )/ 2.9;

        System.out.println(result);
    }
                                                                              
}
