
import com.google.gson.Gson;
import com.todo.controllers.TaskController;
import com.todo.routes.TaskRoutes;
import static spark.Spark.get;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args){
        new TaskRoutes(new TaskController());
    }
}