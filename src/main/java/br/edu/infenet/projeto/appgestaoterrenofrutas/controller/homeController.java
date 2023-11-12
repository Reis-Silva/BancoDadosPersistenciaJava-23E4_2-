package br.edu.infenet.projeto.appgestaoterrenofrutas.controller;

import br.edu.infenet.projeto.appgestaoterrenofrutas.app.Projeto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@Controller
public class homeController {

    private Projeto projeto;

    public void incluir(Projeto projeto) {
        this.projeto = projeto;
    }

    @GetMapping(value = "/")
    public String telaHome() {
        return "home";
    }

    @GetMapping(value = "/login")
    public String telaLogin() {
        return "login";
    }

    @GetMapping(value = "/logout")
    public String telaLogout(HttpSession session, SessionStatus status) {

        status.setComplete();

        session.removeAttribute("user");

        return "redirect:/";
    }

    @GetMapping(value = "/sobre")
    public String telaSobre(Model model) {

        model.addAttribute("projeto", projeto);

        return "sobre";
    }
}
