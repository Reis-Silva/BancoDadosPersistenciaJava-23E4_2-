package br.edu.infenet.projeto.appgestaoterrenofrutas.service;

import br.edu.infenet.projeto.appgestaoterrenofrutas.repository.PedidoRepository;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Pedido;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Collection<Pedido> obterLista(){

        return (Collection<Pedido>) pedidoRepository.findAll();
    }

    public Collection<Pedido> obterLista(Usuario usuario){

        List<Pedido> lista = pedidoRepository.obterLista(usuario.getId());

        if(lista.isEmpty()) {
            return Collections.emptyList();
        }

        return lista;
    }

    public void incluir(Pedido pedido) {

        pedidoRepository.save(pedido);
    }

    public void excluir(Long id) {

        pedidoRepository.deleteById(id);
    }
}
