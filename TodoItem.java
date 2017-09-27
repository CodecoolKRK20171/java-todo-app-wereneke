import java.util.Date;
import java.util.Scanner;

import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * Class representing a single todo item.
 * 
 */
public class TodoItem {

    Date deadline;
    String description;
    Boolean isImportant;

    SimpleDateFormat dateFormat = new SimpleDateFormat ("dd.mm.yy");
    Scanner scan =  new Scanner(System.in);


    public void setDeadline() throws ParseException {

        System.out.println("When is deadline for this task? (use dd.mm.yy pattern)");
        String deadline = scan.next();
        this.deadline = dateFormat.parse(deadline);

    }

    public void setDescription() {

        System.out.println("What is the task?");
        String description = scan.next();
        this.description = description;

    }

    public void setImportance() {

        System.out.println("Is this super important for you? (y/n)");
        String answer = scan.next();
        this.isImportant = answer.equals("y") ? true : false;
    }

    public void setItem(){

        setDescription();
        try{
            setDeadline();
        }catch (ParseException e) {
           System.out.println("nieudaosie");
       }
        setImportance();

    }

   public String toString() {

       return String.format("%s   %s", dateFormat.format(this.deadline), description);

   }

   public static void main(String[] args) {

       TodoItem i = new TodoItem();

           i.setItem();
       
       System.out.println(i.toString());

   }
}
