 import java.util.*;
 
public class BarowoProject1 {
 
 public static void main(String[] args) { 

   Scanner user_input = new Scanner(System.in);
   System.out.println("LiberateToAutomate\n\n");
   System.out.println("Do you like sport?");
   String Quastion1 = user_input.nextLine();
   System.out.println("What team do you like?");
   String Quastion2  = user_input.nextLine();
   System.out.println("On what league do they play?");
   String Quastion3  = user_input.nextLine();
   System.out.println("Why do you like them?");
   String Quastion4  = user_input.nextLine();
   System.out.println("Are they going to win trophies this year?");
   String Quastion5  = user_input.nextLine();

   System.out.println("\n\n\n\n");

   System.out.println("Answer1:" + Quastion1);
   System.out.println("Answer2:" + Quastion2);
   System.out.println("Answer3:" + Quastion3);
   System.out.println("Answer4:" + Quastion4);
   System.out.println("Answer5:" + Quastion5);
   System.out.println("Good answers!");
 }
}

