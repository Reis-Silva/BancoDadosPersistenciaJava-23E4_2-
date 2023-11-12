package br.edu.infenet.projeto.appgestaoterrenofrutas.test;

import br.edu.infenet.projeto.appgestaoterrenofrutas.service.ClienteService;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Cliente;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Produto;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Order(2)
@Component
public class ClienteLoader implements ApplicationRunner {

	@Autowired
	ClienteService clienteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(new Cliente("Julio", "00000000001", "teste1@gmail.com"));
		clientes.add(new Cliente("Cesar", "00000000002", "teste2@gmail.com"));
		clientes.add(new Cliente("Reis", "00000000003", "teste3@gmail.com"));

		System.out.println(Produto.buscarSaudacaoAtual());

		for(Cliente cliente : clientes ) {
			System.out.println("Cliente: " + cliente.toString() + "\n");
			cliente.setUsuario(new Usuario("user1", "user1@gmail.com", "123"));
			cliente.getUsuario().setId(1L);
			clienteService.incluir(cliente);
		}
	}
}
