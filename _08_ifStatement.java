import java.util.Scanner;
public class _08_ifStatement {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

// IF STATEMENT 

int age  ;
String name ;
boolean isStudent ; 

System.out.print("What is your name ? ");
name = scanner.nextLine();

System.out.print("What is you age ? ");
age = scanner.nextInt();

System.out.print("Are you a student (true/false) : ");
isStudent = scanner.nextBoolean();

// GROUP 1 

if(name.isEmpty()){
    System.out.println("You didn't enter your name ! 🤬 ");

}

else{
    System.out.println("Hello " + name + " !");
}


// GROUP 2

if(age >= 65){
    System.out.println("You are a senior 👴");
}

else if(age >= 18) {
   System.out.println("You are an adult 👨");

}
else if(age < 0){
    System.out.println("You are a soul 👻");
}

else if(age == 0){
    System.out.println("You are a baby 👶");
}

else{
    System.out.println("You are a child 👶");
}

// GROUP 3 

if(isStudent == true ){
    System.out.println("You are a student 🧑‍🎓");
}
else{
    System.out.println("You are not a student !");
}

    scanner.close();
}

}
