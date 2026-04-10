/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aula01.main.dao;

import com.aula01.main.model.FuncionarioBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gaigu
 */
public class FuncionarioDAO {
    public List<FuncionarioBean> listarFuncionarios() {
        List<FuncionarioBean> lista = new ArrayList();
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * FROM funcionarios");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                FuncionarioBean funcionario = new FuncionarioBean();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setDepartamento(rs.getString("departamento"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setDataContratacao(rs.getDate("data_contratacao"));
                
                lista.add(funcionario);
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return lista;
    }
    
    public int funcionariosCount() {
        int count = 0;
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT COUNT(*) as total FROM funcionarios");
            rs = stmt.executeQuery();
            
            if(rs.next()){
                count = rs.getInt("total");

            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return count;
    }
    
    public List<FuncionarioBean> funcionariosTecnologia() {
        List<FuncionarioBean> lista = new ArrayList();
        try{
            Connection conn = Conexao.conectar();
            
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * FROM funcionarios WHERE departamento = 'Tecnologia'");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                FuncionarioBean funcionario = new FuncionarioBean();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setDepartamento(rs.getString("departamento"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setDataContratacao(rs.getDate("data_contratacao"));
                
                lista.add(funcionario);
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return lista;
    }
}
