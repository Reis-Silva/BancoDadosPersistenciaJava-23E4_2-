package br.edu.infenet.projeto.appgestaoterrenofrutas.service;

import br.edu.infenet.projeto.appgestaoterrenofrutas.repository.PolpaRepository;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Polpa;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PolpaService {

    @Autowired
    private PolpaRepository polpaRepository;

    public Collection<Polpa> obterLista(){

        return (Collection<Polpa>) polpaRepository.findAll();
    }

    public Collection<Polpa> obterLista(Usuario usuario){

        return polpaRepository.obterLista(usuario.getId());
    }

    public void incluir(Polpa polpa) {

        polpaRepository.save(polpa);
    }

    public void excluir(Long id) {

        polpaRepository.deleteById(id);
    }
}
