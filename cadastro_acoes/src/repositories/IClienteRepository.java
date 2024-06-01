package repositories;

import entities.Cliente;
import java.util.List;

public interface IClienteRepository {
    void cadastrar(Cliente cliente);
    Cliente buscarPorNome(String nome);
    List<Cliente> listar();
    void atualizar(Cliente cliente);
    void deletar(Cliente cliente);
}