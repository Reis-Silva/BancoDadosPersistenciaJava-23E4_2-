package br.edu.infenet.projeto.appgestaoterrenofrutas.controller;

import br.edu.infenet.projeto.appgestaoterrenofrutas.service.UsuarioService;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SessionAttributes("user")
@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(value = "/valida")
    public String validar(Model model, @RequestParam String email, @RequestParam String senha) {

        Usuario user = usuarioService.validar(email, senha);

        if(user != null) {

            model.addAttribute("user", user);

            return "home";
        }
        return "redirect:/login";
    }

    @GetMapping(value = "/usuario/lista")
    public String telaLista(Model model) {

        model.addAttribute("listaUsuario", usuarioService.obterLista());

        return "usuario/lista";
    }

    @GetMapping(value = "/usuario/cadastro")
    public String telaCadastro() {

        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario) {

        Usuario usuarioExiste = usuarioService.validar(usuario.getEmail(), usuario.getSenha());

        if (usuarioExiste != null){
            throw new RuntimeException("Usuario Já Existe");
        }

        usuarioService.incluir(usuario);

        return "redirect:/";
    }

    @GetMapping(value = "/usuario/excluir/{id}")
    public String excluir(@PathVariable Integer id) {

        usuarioService.excluir(id);

        return "redirect:/usuario/lista";
    }
}
