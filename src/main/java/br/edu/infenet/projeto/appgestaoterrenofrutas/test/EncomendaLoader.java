package br.edu.infenet.projeto.appgestaoterrenofrutas.test;

import br.edu.infenet.projeto.appgestaoterrenofrutas.service.EncomendaService;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Encomenda;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Order(4)
@Component
public class EncomendaLoader implements ApplicationRunner {

	@Autowired
	EncomendaService encomendaService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<Encomenda> encomendas = new ArrayList<Encomenda>();
		encomendas.add(new Encomenda(150f, LocalDateTime.now().plusDays(10), "Safra 1", "Encomenda 1", 1000.00f, 7L));
		encomendas.add(new Encomenda(300f, LocalDateTime.now().plusDays(10), "Safra 2", "Encomenda 2", 10.0f, 2000L));
		encomendas.add(new Encomenda(300f, LocalDateTime.now().plusDays(10), "Safra 3", "Encomenda 3", 2000.00f, 9L));

		for(Encomenda encomenda : encomendas) {
			encomenda.setUsuario(new Usuario("user1", "user1@gmail.com", "123"));
			encomenda.getUsuario().setId(1L);
			System.out.println("Encomenda:" + encomenda.toString() + "\n");
			encomendaService.incluir(encomenda);
		}
	}
}
