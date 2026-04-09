/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulaum.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Aluno
 */
@Controller
public class PortalController {
    
    @GetMapping("/Portal")
    public String abrirPortal() {
        return "portal";
    }
    
    @GetMapping("/Servicos")
    public String abrirServicos() {
        return "servicos";
    }
    
    @GetMapping("/Contato")
    public String abrirContato() {
        return "contato";
    }
   
}
    

