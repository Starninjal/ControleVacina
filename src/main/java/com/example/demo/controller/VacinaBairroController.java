package com.example.demo.controller;

import com.example.demo.domain.Usuario;
import com.example.demo.dto.VacinaBairroDto;
import com.example.demo.services.VacinaBairroService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/vacinas")
public class VacinaBairroController {

    @Autowired
    private VacinaBairroService service;

    @GetMapping
    public String telaCadastroVacina() {
        return "cadastro_vacina";
    }

    @PostMapping
    public String insert(VacinaBairroDto vacinaBairroDto) {
        service.insert(vacinaBairroDto);
        return "redirect:/vacinas";
    }
}
