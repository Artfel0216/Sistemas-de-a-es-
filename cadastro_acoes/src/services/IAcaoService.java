
package services;

import entities.Acao;

import java.util.List;

public interface IAcaoService {
    void cadastrarAcao(String nome, double precoFechamento);
    Acao buscarAcaoPorNome(String nome);
    List<Acao> listarAcoes();
    void atualizarAcao(String nome, double novoPrecoFechamento);
    void deletarAcao(String nome);
}
