/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aula01.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {
    @GetMapping("/perfil")
    public String abrirPerfil(Model model) {
        model.addAttribute("nome", "Daniel Gaiguer");
        model.addAttribute("curso", "Desenvolvimento de Sistemas");
        model.addAttribute("linguagemFavorita", "Typescript");
        return "perfil";
    }
}
