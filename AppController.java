import java.util.Scanner;


class AppController {


    public static void main(String[] args) {

    App app = new App();

    Scanner scan = new Scanner(System.in);
    String toDo = new String();

    do {

      View.printMenu();
      toDo = scan.next();

        switch (toDo) {
          
          case "1" : TodoItem item = new TodoItem();
                    item.setItem();
                    app.addItem(item);
                    break;

          case "2" : View.printLists(app.IU, app.IN, app.NN, app.NU);
            break;
        }

    } while(! toDo.equals("0"));

  }

}