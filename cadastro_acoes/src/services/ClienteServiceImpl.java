package services;

import entities.Cliente;
import repositories.IClienteRepository;
import java.util.List;

public class ClienteServiceImpl implements IClienteService {
    private IClienteRepository clienteRepository;

    public ClienteServiceImpl(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public void cadastrarCliente(String nome, String cpf) {
        Cliente cliente = new Cliente(nome, cpf);
        clienteRepository.cadastrar(cliente);
    }

    @Override
    public Cliente buscarClientePorNome(String nome) {
        return clienteRepository.buscarPorNome(nome);
    }

    @Override
    public List<Cliente> listarClientes() {
        return clienteRepository.listar();
    }

    @Override
    public void atualizarCliente(String nome, String novoCpf) {
        Cliente cliente = clienteRepository.buscarPorNome(nome);
        if (cliente != null) {
            cliente.setCpf(novoCpf);
            clienteRepository.atualizar(cliente);
        }
    }

    @Override
    public void deletarCliente(String nome) {
        Cliente cliente = clienteRepository.buscarPorNome(nome);
        if (cliente != null) {
            clienteRepository.deletar(cliente);
        }
    }
}