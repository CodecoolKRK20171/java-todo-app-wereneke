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
    Boolean isDone = false;

    SimpleDateFormat dateFormat = new SimpleDateFormat ("dd-MM-yy");
    

    public void mark() {
        this.isDone = !this.isDone;
    }


    public void setDeadline(){

        Scanner scan =  new Scanner(System.in);

        try {
            System.out.println("When is deadline for this task? (use dd-mm-yy pattern)");
            String deadline = scan.next();
            this.deadline = dateFormat.parse(deadline);
        }catch (ParseException e) {
           System.out.println("nieudaosie");
       }
       scan.close();

    }

    public void setDescription() {

        Scanner scan =  new Scanner(System.in);

        System.out.println("What is the task?");
        String description = scan.next();
        this.description = description;

        scan.close();

    }

    public void setImportance() {

        Scanner scan =  new Scanner(System.in);

        System.out.println("Is this super important for you? (y/n)");
        String answer = scan.next();
        this.isImportant = answer.equals("y") ? true : false;

        scan.close();
    }

    public void setItem(){

        setDescription();

        setDeadline();
        
        setImportance();

    }

   public String toString() {

       String mark = isDone ? "[x]" : "[ ]";

       return String.format("%s %s  %s", dateFormat.format(this.deadline), mark, description);

   }

   public Boolean isUrgent() {

       Date now = new Date();
       if (deadline.getYear() <= now.getYear() && deadline.getMonth() <= now.getMonth() && deadline.getDay() - now.getDay() <= 3) return true;
       return false;

   }

   public static void main(String[] args) {

       TodoItem i = new TodoItem();

           i.setItem();
       
       System.out.println(i.toString());

   }
}
