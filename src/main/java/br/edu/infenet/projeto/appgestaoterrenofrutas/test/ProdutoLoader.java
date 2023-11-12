package br.edu.infenet.projeto.appgestaoterrenofrutas.test;

import br.edu.infenet.projeto.appgestaoterrenofrutas.service.ProdutoService;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Order(6)
@Component
public class ProdutoLoader implements ApplicationRunner {

	@Autowired
	ProdutoService produtoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		List<Produto> produtoList = new ArrayList<>();
		produtoList.add(new Fruta(350f, true, LocalDateTime.now().plusDays(10), "Produto 1", 15.50f, 4L));
		produtoList.add(new Encomenda(800f, LocalDateTime.now().plusDays(10),"Encomenda Produto 1", "Produto 2", 20.0f, 5L));
		produtoList.add(new Polpa(true, 300f, "Polpa Produto 3", "Produto 3", 50.00f, 6L));

		for(Produto produto : produtoList) {
			produto.setUsuario(new Usuario("user1", "user1@gmail.com", "123"));
			produto.getUsuario().setId(1L);
			System.out.println("Produto:" + produto.toString() + "\n");
			produtoService.incluir(produto);
		}
	}
}