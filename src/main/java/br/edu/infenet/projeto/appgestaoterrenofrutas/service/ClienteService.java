package br.edu.infenet.projeto.appgestaoterrenofrutas.service;

import br.edu.infenet.projeto.appgestaoterrenofrutas.repository.ClienteRepository;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Cliente;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Collection<Cliente> obterLista(){

        return (Collection<Cliente>) clienteRepository.findAll();
    }

    public Collection<Cliente> obterLista(Usuario usuario){

        return (Collection<Cliente>) clienteRepository.obterLista(usuario.getId());
    }

    public Cliente obterCliente(String cpf){

        return clienteRepository.obterCliente(cpf);
    }

    public void incluir(Cliente solicitante) {

        clienteRepository.save(solicitante);
    }

    public void excluir(Long id) {

        clienteRepository.deleteById(id);
    }
}
