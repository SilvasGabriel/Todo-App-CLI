package todo_list_cli;

import java.util.Scanner;
/**
 * TextInterface
 */

public class TextInterface {

    private Scanner scanner;
    private TodoApp todoos;

    //constructor
    public TextInterface(Scanner scanner, TodoApp todoos){

        this.scanner = scanner;
        this.todoos = todoos;

    }

    //Where the program goona start
    public void start(){
    
        while (true) {
            
            System.out.println("\n\n"+"TODO APP\n\n TYPE A COMMAND OF THE LIST BELOW:\n\n -add\n -update\n -read\n -remove\n\n TO FINISH THE APP TYPE\n\n -exit\n ");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("exit")){
                break;
            }

            if(input.equals("add")){
                System.out.println("\nType what to do...\n");
                String task = scanner.nextLine();
                todoos.addTodo(task);
                System.out.println("\nTask added with success!");
            }
            

           
            if(input.equals("read")){
                todoos.readTodo();
            }
            
            if(input.equals("update")){
                System.out.println("\nType the number of the task you gonna change and next to change the content of the task");
                int numberTask = scanner.nextInt();
                String taskNew = scanner.nextLine();
                todoos.updateTodoo(numberTask, taskNew);
                System.out.println("\n Task updated with success");
            }
            
            if(input.equals("remove")){
                System.out.println("\nType the number of the task you wanna remove");
                int numberRemove = scanner.nextInt();
                todoos.removeTodo(numberRemove);
            }
            
        }

    }

    //Mehtods to activate commands ADD,UPDATE,READ,REMOVE

    
}