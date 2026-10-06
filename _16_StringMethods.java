
public class _16_StringMethods {
    public static void main(String[] args) {

        String name = "Ankur yadav          " ;
        int length = name.length();
        char letter = name.charAt(6);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("a");
        name = name.toUpperCase();
        name = name.trim();
       name = name.replace("a","m");

      
        System.out.println(name.isEmpty());

        if(name.isEmpty()){

            System.out.println("You didnt enter your name ");
        }
        else{
            System.out.println("Hello " +name);
        }

        if(name.contains(" ")){
            System.out.println("your name contains space ");
        }
        else{
            System.out.println("your name didnt contain space");
        }

System.out.println(length);
System.out.println(letter);
System.out.println(index);
System.out.println(lastIndex);





    }
}
