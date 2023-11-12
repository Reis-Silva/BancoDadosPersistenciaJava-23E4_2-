package br.edu.infenet.projeto.appgestaoterrenofrutas.service;

import br.edu.infenet.projeto.appgestaoterrenofrutas.repository.UsuarioRepository;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepositoty;

    public Collection<Usuario> obterLista(){

        return (Collection<Usuario>) usuarioRepositoty.findAll();
    }

    public void incluir(Usuario usuario) {

        usuarioRepositoty.save(usuario);
    }

    public void excluir(Integer id) {

        usuarioRepositoty.deleteById(id);
    }

    public Usuario validar(String email, String senha) {

        Usuario user = usuarioRepositoty.findByEmail(email);

        if(user != null) {
            if(senha.equalsIgnoreCase(user.getSenha())) {
                return user;
            }
        }

        return null;
    }
}
