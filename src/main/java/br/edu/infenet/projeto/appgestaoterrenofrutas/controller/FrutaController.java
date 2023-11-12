package br.edu.infenet.projeto.appgestaoterrenofrutas.controller;

import br.edu.infenet.projeto.appgestaoterrenofrutas.service.FrutaService;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Fruta;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class FrutaController {

    @Autowired
    private FrutaService frutaService;

    @GetMapping(value = "/fruta/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("listaFruta", frutaService.obterLista(usuario));

        return "fruta/lista";
    }

    @GetMapping(value = "/fruta/cadastro")
    public String telaCadastro() {

        return "fruta/cadastro";
    }

    @PostMapping(value = "/fruta/incluir")
    public String incluir(Fruta fruta, @SessionAttribute("user") Usuario usuario) {

        fruta.setUsuario(usuario);

        frutaService.incluir(fruta);

        return "redirect:/fruta/lista";
    }

    @GetMapping(value = "/fruta/excluir/{id}")
    public String exclusao(@PathVariable Long id) {

        frutaService.excluir(id);

        return "redirect:/fruta/lista";
    }
}
