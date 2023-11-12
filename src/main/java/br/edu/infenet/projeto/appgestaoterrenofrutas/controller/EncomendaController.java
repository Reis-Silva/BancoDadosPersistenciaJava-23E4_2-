package br.edu.infenet.projeto.appgestaoterrenofrutas.controller;

import br.edu.infenet.projeto.appgestaoterrenofrutas.service.EncomendaService;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Encomenda;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class EncomendaController {

    @Autowired
    private EncomendaService encomendaService;

    @GetMapping(value = "/encomenda/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("listaEncomenda", encomendaService.obterLista(usuario));

        return "encomenda/lista";
    }

    @GetMapping(value = "/encomenda/cadastro")
    public String telaCadastro() {

        return "encomenda/cadastro";
    }

    @PostMapping(value = "/encomenda/incluir")
    public String incluir(Encomenda encomenda, @SessionAttribute("user") Usuario usuario) {

        encomenda.setUsuario(usuario);

        encomendaService.incluir(encomenda);

        return "redirect:/encomenda/lista";
    }

    @GetMapping(value = "/encomenda/excluir/{id}")
    public String exclusao(@PathVariable Long id) {

        encomendaService.excluir(id);

        return "redirect:/encomenda/lista";
    }
}
