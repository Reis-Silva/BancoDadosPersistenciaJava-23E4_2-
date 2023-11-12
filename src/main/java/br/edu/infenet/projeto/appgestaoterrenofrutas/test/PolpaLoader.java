package br.edu.infenet.projeto.appgestaoterrenofrutas.test;

import br.edu.infenet.projeto.appgestaoterrenofrutas.service.PolpaService;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Polpa;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Order(5)
@Component
public class PolpaLoader implements ApplicationRunner {

	@Autowired
	PolpaService polpaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<Polpa> polpas = new ArrayList<Polpa>();
		polpas.add(new Polpa(true, 350f, "Polpa 1", "Maracuja", 4.50f, 1L));
		polpas.add(new Polpa(false, 50f, "Polpa 2", "Goiaba", 20.0f, 2L));
		polpas.add(new Polpa(true, 350f, "Polpa 3", "manga", 10.00f, 3L));

		System.out.println(Polpa.buscarSaudacaoAtual());

		for(Polpa polpa : polpas) {
			polpa.setUsuario(new Usuario("user1", "user1@gmail.com", "123"));
			polpa.getUsuario().setId(1L);
			System.out.println("Polpa:" + polpa.toString() + "\n");
			polpaService.incluir(polpa);
		}
	}
}
