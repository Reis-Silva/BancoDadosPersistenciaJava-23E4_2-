package br.edu.infenet.projeto.appgestaoterrenofrutas.test;

import br.edu.infenet.projeto.appgestaoterrenofrutas.service.FrutaService;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Fruta;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Produto;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Order(3)
@Component
public class FrutaLoader implements ApplicationRunner {

	@Autowired
	FrutaService frutaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<Fruta> frutas = new ArrayList<Fruta>();
		frutas.add(new Fruta(350f, true, LocalDateTime.now().plusDays(10), "fruta 1", 15.50f, 4L));
		frutas.add(new Fruta(800f, false, LocalDateTime.now().plusDays(10), "fruta 2", 20.0f, 5L));
		frutas.add(new Fruta(600f, false, LocalDateTime.now().plusDays(10), "fruta 3", 50.00f, 6L));

		System.out.println(Produto.buscarSaudacaoAtual());

		for(Fruta fruta : frutas) {
			fruta.setUsuario(new Usuario("user1", "user1@gmail.com", "123"));
			fruta.getUsuario().setId(1L);
			System.out.println("fruta" + fruta.toString() + "\n");
			frutaService.incluir(fruta);
		}
	}
}
