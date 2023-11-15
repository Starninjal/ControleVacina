package com.example.demo.controller;

import com.example.demo.domain.Usuario;
import com.example.demo.dto.LoginDto;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    public String insert(LoginDto loginDto) {
        if (!repository.findByLogin(loginDto)) {
            return "redirect:/";
        }
        return "redirect:/vacinas";
    }

    @GetMapping
    public String telaLogin() {
        return "login";
    }
}
