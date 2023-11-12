package br.edu.infenet.projeto.appgestaoterrenofrutas.repository;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    public Usuario findByEmail(String email);

}
