import java.io.IOException;

class View {

    public static void printMenu() {
    
        String[] menu = {"Add task", "Display lists", "Exit"};

        

        for (int i = 0; i < menu.length; i++ ) {
        
            if ( menu[i].equals("Exit")) {
                System.out.println( "0 " + menu[i]);
            }
            else {
                System.out.println(i+1 + " " + menu[i]);
            }
            
        }
    }

    public static void printLists(TodoList ... args) {



        for (TodoList tdl: args) {

            System.out.println(tdl.toString());
        }

       try{
           System.in.read();
           }catch (IOException e) {
               e.printStackTrace();
           }

    }

    
}