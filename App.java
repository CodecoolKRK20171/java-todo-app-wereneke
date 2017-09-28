import java.util.Date;
import java.util.Scanner;
/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App{

  TodoList IU = new TodoList("Important and Urgent");
  TodoList IN = new TodoList("Important and Not Urgent");
  TodoList NU = new TodoList("Not Important and Urgent");
  TodoList NN = new TodoList("Not Important and Not Urgent");


  public void addItem(TodoItem item) {
    
    if (item.isUrgent()) {

      if (item.isImportant) {

        IU.add(item);
      }
      else {

        NU.add(item);
      }

    }
    else {

      if (item.isImportant) {

        IN.add(item);
      }
      else {

        NN.add(item);
      }

    }
    
  }
  
  
}
