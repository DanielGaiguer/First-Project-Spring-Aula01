/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aula01.main.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gaigu
 */
public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/empresa_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Daniboy2@";
    
    public static Connection conectar() {
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(URL, USER, PASSWORD);    
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return conn;
    }
}
