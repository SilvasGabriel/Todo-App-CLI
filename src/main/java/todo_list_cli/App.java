package todo_list_cli;

import java.util.Scanner;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        try (Scanner read = new Scanner(System.in)) {

            
        TodoApp todo = new TodoApp();
        TextInterface uiText = new TextInterface(read, todo);

        uiText.start();


        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }

    }
}
