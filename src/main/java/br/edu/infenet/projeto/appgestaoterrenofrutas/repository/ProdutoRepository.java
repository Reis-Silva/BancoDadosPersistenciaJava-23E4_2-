package br.edu.infenet.projeto.appgestaoterrenofrutas.repository;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {

    @Query("from Produto p where p.usuario.id = :userid")
    public List<Produto> obterLista(Long userid);
}
