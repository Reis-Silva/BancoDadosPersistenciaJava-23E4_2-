package br.edu.infenet.projeto.appgestaoterrenofrutas.test;

import br.edu.infenet.projeto.appgestaoterrenofrutas.service.UsuarioService;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Order(1)
@Component
public class UsuarioLoader implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		List<Usuario> usuarioList = new ArrayList<>();
		usuarioList.add(new Usuario("user1", "user1@gmail.com", "123"));
		usuarioList.add(new Usuario("user2", "user2@gmail.com", "123"));
		usuarioList.add(new Usuario("user3", "user3@gmail.com", "123"));

		for (Usuario usuario : usuarioList) {
			System.out.println("Usuario:" + usuario.toString() + "\n");
			usuarioService.incluir(usuario);
		}
	}
}