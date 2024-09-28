package todo_list_cli;

import java.util.ArrayList;

/**
 * TodoApp
 */

public class TodoApp {

    private ArrayList<String> todos ;

    //constructor
    public TodoApp(){
        this.todos =  new ArrayList<>();
    }

    //Methods of the todoApp
    //ADD - READ - UPDADE - REMOVE
    
    //ADD
    public void addTodo(String todo){
        
        this.todos.add(todo);
        
    }

    //READ
    public void readTodo(){

        for (String tod : todos) {
            int index = todos.indexOf(tod) + 1;
            System.out.println("\n");
            System.out.println(index + " : " + tod);   
        }
   
    }

    //UPDADE
    public void updateTodoo(int index, String todo){

        for (int i = 0; i < todos.size() ; i++) {
      
            if(!(index == 0)){
                
                this.todos.set((index - 1), todo);
            
            }

        }
        
        
    }

    //REMOVE 
    public void removeTodo(int todoNumber){

        this.todos.remove(todoNumber - 1);
    
    }



}