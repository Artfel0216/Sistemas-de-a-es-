package repositories;

import entities.Ordem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrdemRepositoryImpl implements IOrdemRepository {
    private Map<Integer, Ordem> ordens = new HashMap<>();

    @Override
    public void cadastrar(Ordem ordem) {
        ordens.put(ordem.getNumero(), ordem);
    }

    @Override
    public Ordem buscarPorNumero(int numero) {
        return ordens.get(numero);
    }

    @Override
    public List<Ordem> listar() {
        return new ArrayList<>(ordens.values());
    }

    @Override
    public void atualizar(Ordem ordem) {
        if (ordens.containsKey(ordem.getNumero())) {
            ordens.put(ordem.getNumero(), ordem);
        }
    }

    @Override
    public void deletar(Ordem ordem) {
        ordens.remove(ordem.getNumero());
    }
}