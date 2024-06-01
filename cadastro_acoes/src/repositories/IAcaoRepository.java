
package repositories;

import entities.Acao;

import java.util.List;

public interface IAcaoRepository {
    void cadastrar(Acao acao);
    Acao buscarPorNome(String nome);
    List<Acao> listar();
    void atualizar(Acao acao);
    void deletar(Acao acao);
}
