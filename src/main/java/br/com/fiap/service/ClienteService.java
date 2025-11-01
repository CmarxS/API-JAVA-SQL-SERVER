package br.com.fiap.service;

import br.com.fiap.entity.Cliente;
import br.com.fiap.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public Cliente atualizar(Integer id, Cliente clienteAtualizado) {
        Cliente existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setCodCliente(clienteAtualizado.getCodCliente());
            existente.setNomeCliente(clienteAtualizado.getNomeCliente());
            existente.setCpfCliente(clienteAtualizado.getCpfCliente());
            existente.setTelefoneCliente(clienteAtualizado.getTelefoneCliente());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public Optional<Cliente> listarPorId(Integer id) {
        return repository.findById(id);
    }
}
