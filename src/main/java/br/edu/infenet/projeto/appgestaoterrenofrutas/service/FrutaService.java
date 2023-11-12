package br.edu.infenet.projeto.appgestaoterrenofrutas.service;

import br.edu.infenet.projeto.appgestaoterrenofrutas.repository.FrutaRepository;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Fruta;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FrutaService {

    @Autowired
    private FrutaRepository frutaRepository;

    public Collection<Fruta> obterLista(){

        return (Collection<Fruta>) frutaRepository.findAll();
    }

    public Collection<Fruta> obterLista(Usuario usuario){

        return frutaRepository.obterLista(usuario.getId());
    }

    public void incluir(Fruta polpa) {

        frutaRepository.save(polpa);
    }

    public void excluir(Long id) {

        frutaRepository.deleteById(id);
    }
}
