package br.edu.infenet.projeto.appgestaoterrenofrutas.repository;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    @Query("from Cliente c where c.usuario.id = :userid")
    public List<Cliente> obterLista(Long userid);

    @Query("from Cliente c where c.cpf = :cpf")
    public Cliente obterCliente(String cpf);
}
