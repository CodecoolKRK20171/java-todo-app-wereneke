class View {

    public static void printMenu() {
    
        String[] menu = {"Add task", "Display lists", "Exit"};

        for (String toDo: menu) {
        
            if ( toDo.equals("Exit")) {
                System.out.println( "0 " + toDo);
            }
            
            int i = 1
            System.out.println(i + " " + toDo);
            i++;
        }
    }
}