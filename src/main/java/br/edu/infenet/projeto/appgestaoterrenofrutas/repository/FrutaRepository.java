package br.edu.infenet.projeto.appgestaoterrenofrutas.repository;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Fruta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FrutaRepository extends CrudRepository<Fruta, Long> {
    @Query("from Fruta f where f.usuario.id = :userid")
    public List<Fruta> obterLista(Long userid);
}
