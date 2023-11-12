package br.edu.infenet.projeto.appgestaoterrenofrutas.repository;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Pedido;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long> {

    @Query("from Pedido p where p.usuario.id = :userid")
    public List<Pedido> obterLista(Long userid);
}
