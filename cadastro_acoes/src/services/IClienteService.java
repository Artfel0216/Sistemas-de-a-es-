package services;

import entities.Cliente;
import java.util.List;

public interface IClienteService {
    void cadastrarCliente(String nome, String cpf);
    Cliente buscarClientePorNome(String nome);
    List<Cliente> listarClientes();
    void atualizarCliente(String nome, String novoCpf);
    void deletarCliente(String nome);
}