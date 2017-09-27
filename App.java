import java.uti.Scanner;
/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App{

  Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args) {

    do {
      
      View.printMenu();
      String toDo = scan.next();
      
      try {
        Char c = toDo;

        switch (c) {
          case 1 :
            break;
          case 2 :
            break;
        }
      } catch(Exception e) {

        e.printStackTrace();

      }
    } while(!toDo.equals("0"));

  }
}
