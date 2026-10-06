import java.util.Random ;
public class _09_RandomNo {
    public static void main(String[] args) {

        // RANDOM NUMBERS USING INT , DOUBLE , BOOLEAN 

        Random random = new Random ();

        boolean isHeads ; 
         
        isHeads = random.nextBoolean();

        if(isHeads==true ){

            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
    }
    
}
