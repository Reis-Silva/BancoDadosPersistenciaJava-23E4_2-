package br.edu.infenet.projeto.appgestaoterrenofrutas.service;

import br.edu.infenet.projeto.appgestaoterrenofrutas.repository.EncomendaRepository;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Encomenda;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EncomendaService {

    @Autowired
    private EncomendaRepository encomendaRepository;

    public Collection<Encomenda> obterLista(){

        return (Collection<Encomenda>) encomendaRepository.findAll();
    }

    public Collection<Encomenda> obterLista(Usuario usuario){

        return encomendaRepository.obterLista(usuario.getId());
    }

    public void incluir(Encomenda encomenda) {

        encomendaRepository.save(encomenda);
    }

    public void excluir(Long id) {

        encomendaRepository.deleteById(id);
    }
}
