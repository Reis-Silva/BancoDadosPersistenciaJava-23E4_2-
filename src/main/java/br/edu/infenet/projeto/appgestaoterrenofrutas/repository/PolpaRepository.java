package br.edu.infenet.projeto.appgestaoterrenofrutas.repository;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Polpa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolpaRepository extends CrudRepository<Polpa, Long> {
    @Query("from Polpa p where p.usuario.id = :userid")
    public List<Polpa> obterLista(Long userid);
}
