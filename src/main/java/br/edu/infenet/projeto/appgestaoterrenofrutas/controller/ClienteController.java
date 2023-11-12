package br.edu.infenet.projeto.appgestaoterrenofrutas.controller;

import br.edu.infenet.projeto.appgestaoterrenofrutas.service.ClienteService;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Cliente;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/cliente/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("listagemCliente", clienteService.obterLista(usuario));

        return "cliente/lista";
    }


    @GetMapping(value = "/cliente/cadastro")
    public String telaCadastro() {

        return "cliente/cadastro";
    }

    @PostMapping(value = "/cliente/incluir")
    public String incluir(Cliente cliente, @SessionAttribute("user") Usuario usuario) {

        cliente.setUsuario(usuario);

        Cliente ClienteExiste = clienteService.obterCliente(cliente.getCpf());

        if (ClienteExiste != null){
            throw new RuntimeException("Cliente Já Existe");
        }

        clienteService.incluir(cliente);

        return "redirect:/cliente/lista";
    }

    @GetMapping(value = "/cliente/excluir/{id}")
    public String excluir(@PathVariable Long id) {

        clienteService.excluir(id);

        return "redirect:/cliente/lista";
    }

    @GetMapping(value = "/cliente/buscar/{cpf}")
    public String buscarCliente(Model model, @PathVariable String cpf) {
        Cliente ClienteExiste = clienteService.obterCliente(cpf);

        if (ClienteExiste == null){
            throw new RuntimeException("Cliente não existe");
        }

        model.addAttribute("cliente", ClienteExiste);

        return "redirect:/cliente/atualizar";
    }

    @PostMapping(value = "/cliente/atualizar")
    public String editar(Cliente cliente, @SessionAttribute("user") Usuario usuario) {
        Cliente ClienteExiste = clienteService.obterCliente(cliente.getCpf());

        if (ClienteExiste == null){
            throw new RuntimeException("Cliente não existe");
        }

        cliente.setUsuario(usuario);

        clienteService.incluir(cliente);

        return "redirect:/cliente/lista";
    }
}
