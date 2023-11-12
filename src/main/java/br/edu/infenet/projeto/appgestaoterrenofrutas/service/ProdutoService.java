package br.edu.infenet.projeto.appgestaoterrenofrutas.service;

import br.edu.infenet.projeto.appgestaoterrenofrutas.repository.ProdutoRepository;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Produto;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Collection<Produto> obterLista(){

        return (Collection<Produto>) produtoRepository.findAll();
    }

    public Collection<Produto> obterLista(Usuario usuario){

        return (Collection<Produto>) produtoRepository.obterLista(usuario.getId());
    }

    public void incluir(Produto produto) {

        produtoRepository.save(produto);
    }

    public void excluir(Long id) {

        produtoRepository.deleteById(id);
    }
}
