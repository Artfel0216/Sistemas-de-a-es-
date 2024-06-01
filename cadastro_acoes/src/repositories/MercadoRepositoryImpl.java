package repositories;

import entities.Mercado;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MercadoRepositoryImpl implements IMercadoRepository {
    private Map<String, Mercado> mercados = new HashMap<>();

    @Override
    public void cadastrar(Mercado mercado) {
        mercados.put(mercado.getNome(), mercado);
    }

    @Override
    public Mercado buscarPorNome(String nome) {
        return mercados.get(nome);
    }

    @Override
    public List<Mercado> listar() {
        return new ArrayList<>(mercados.values());
    }

    @Override
    public void atualizar(Mercado mercado) {
        if (mercados.containsKey(mercado.getNome())) {
            mercados.put(mercado.getNome(), mercado);
        }
    }

    @Override
    public void deletar(Mercado mercado) {
        mercados.remove(mercado.getNome());
    }
}