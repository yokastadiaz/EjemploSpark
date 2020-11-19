/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.todo.dao;

import com.todo.db.ConnectionDB;
import com.todo.models.Task;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class TaskDao {
        public List<Task> getAll(){
            List <Task> tasks = new ArrayList<Task>();
            ConnectionDB db = new ConnectionDB();
            Connection conn = null;
            
                try {
                    conn = new ConnectionDB().getConnection();
                    String query = "SELECT * FROM tasks";
                    Statement stnt = conn.createStatement();
                    ResultSet rs = stnt.executeQuery(query);
                    while (rs.next()){
                        Task t = new Task();
                        t.setId(rs.getInt("id"));
                        t.setTask(rs.getString("Task"));
                        t.setTask(rs.getString("Status"));
                        tasks.add(t);
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TaskDao.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TaskDao.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    db.close();
                }
            return tasks;
        }
}
