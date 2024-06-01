package repositories;

import entities.Corretora;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CorretoraRepositoryImpl implements ICorretoraRepository {
    private Map<String, Corretora> corretoras = new HashMap<>();

    @Override
    public void cadastrar(Corretora corretora) {
        corretoras.put(corretora.getNome(), corretora);
    }

    @Override
    public Corretora buscarPorNome(String nome) {
        return corretoras.get(nome);
    }

    @Override
    public List<Corretora> listar() {
        return new ArrayList<>(corretoras.values());
    }

    @Override
    public void atualizar(Corretora corretora) {
        if (corretoras.containsKey(corretora.getNome())) {
            corretoras.put(corretora.getNome(), corretora);
        }
    }

    @Override
    public void deletar(Corretora corretora) {
        corretoras.remove(corretora.getNome());
    }
}