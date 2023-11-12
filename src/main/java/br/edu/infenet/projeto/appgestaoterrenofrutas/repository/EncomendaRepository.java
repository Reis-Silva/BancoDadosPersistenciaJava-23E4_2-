package br.edu.infenet.projeto.appgestaoterrenofrutas.repository;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Encomenda;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EncomendaRepository extends CrudRepository<Encomenda, Long> {
    @Query("from Encomenda e where e.usuario.id = :userid")
    public List<Encomenda> obterLista(Long userid);
}
