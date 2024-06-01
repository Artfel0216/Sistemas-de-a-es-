
package repositories;

import entities.Acao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AcaoRepositoryImpl implements IAcaoRepository {
    private Map<String, Acao> acoes = new HashMap<>();

    @Override
    public void cadastrar(Acao acao) {
        acoes.put(acao.getNome(), acao);
    }

    @Override
    public Acao buscarPorNome(String nome) {
        return acoes.get(nome);
    }

    @Override
    public List<Acao> listar() {
        return new ArrayList<>(acoes.values());
    }

    @Override
    public void atualizar(Acao acao) {
        if (acoes.containsKey(acao.getNome())) {
            acoes.put(acao.getNome(), acao);
        }
    }

    @Override
    public void deletar(Acao acao) {
        acoes.remove(acao.getNome());
    }
}
