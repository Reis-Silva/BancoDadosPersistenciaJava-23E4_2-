package br.edu.infenet.projeto.appgestaoterrenofrutas.controller;

import br.edu.infenet.projeto.appgestaoterrenofrutas.service.PolpaService;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Polpa;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class PolpaController {

    @Autowired
    private PolpaService polpaService;

    @GetMapping(value = "/polpa/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("listaPolpa", polpaService.obterLista(usuario));

        return "polpa/lista";
    }

    @GetMapping(value = "/polpa/cadastro")
    public String telaCadastro() {

        return "polpa/cadastro";
    }

    @PostMapping(value = "/polpa/incluir")
    public String incluir(Polpa polpa, @SessionAttribute("user") Usuario usuario) {

        polpa.setUsuario(usuario);

        polpaService.incluir(polpa);

        return "redirect:/polpa/lista";
    }

    @GetMapping(value = "/polpa/excluir/{id}")
    public String exclusao(@PathVariable Long id) {

        polpaService.excluir(id);

        return "redirect:/polpa/lista";
    }
}
