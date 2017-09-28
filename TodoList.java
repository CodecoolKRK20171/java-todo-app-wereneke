import java.util.ArrayList;

/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList{

    String name;
    ArrayList<TodoItem> todoList;

    public TodoList(String name) {

        this.name = name;
    }

    public void add(TodoItem item) {
        
        todoList.add(item);
    }

    public void remove(TodoItem item) {

        todoList.remove(item);
    }

    public void sort() {

        for (int i = 0; i < todoList.size(); i++){
            for (int j = 1; j < todoList.size() - i; j++) {
                if (todoList.get(j-1).deadline.after(todoList.get(j).deadline)) {
                    TodoItem temp = todoList.get(j-1);
                    todoList.set(j-1, todoList.get(j));
                    todoList.set(j, temp);
                }
            }
        }

    }

    public String toString() {

        String stringList = name + "\n";

        try{
            for (int i = 1; i <= todoList.size(); i++) {
            stringList += String.format("(%d) %s \n", i, todoList.get(i-1).toString());
            }
            }catch (NullPointerException e) {
                System.out.println("No tasks");
            }
        return stringList;
    }


}
