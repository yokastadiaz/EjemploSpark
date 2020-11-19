/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.todo.routes;

import com.google.gson.Gson;
import com.todo.controllers.TaskController;
import static spark.Spark.get;

/**
 *
 * @author HP
 */
public class TaskRoutes {
    private TaskController taskController;
    public TaskRoutes(TaskController taskController) {
        Gson gson = new Gson();
        
        get("/tasks", (req, res)->taskController.index(req, res), gson::toJson);
    }
    
}
