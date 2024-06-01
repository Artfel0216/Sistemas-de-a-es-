package repositories;

import entities.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteRepositoryImpl implements IClienteRepository {
    private Map<String, Cliente> clientes = new HashMap<>();

    @Override
    public void cadastrar(Cliente cliente) {
        clientes.put(cliente.getNome(), cliente);
    }

    @Override
    public Cliente buscarPorNome(String nome) {
        return clientes.get(nome);
    }

    @Override
    public List<Cliente> listar() {
        return new ArrayList<>(clientes.values());
    }

    @Override
    public void atualizar(Cliente cliente) {
        if (clientes.containsKey(cliente.getNome())) {
            clientes.put(cliente.getNome(), cliente);
        }
    }

    @Override
    public void deletar(Cliente cliente) {
        clientes.remove(cliente.getNome());
    }
}
