
package services;

import entities.Acao;
import repositories.IAcaoRepository;

import java.util.List;

public class AcaoServiceImpl implements IAcaoService {
    private IAcaoRepository acaoRepository;

    public AcaoServiceImpl(IAcaoRepository acaoRepository) {
        this.acaoRepository = acaoRepository;
    }

    @Override
    public void cadastrarAcao(String nome, double precoFechamento) {
        Acao acao = new Acao(nome, precoFechamento);
        acaoRepository.cadastrar(acao);
    }

    @Override
    public Acao buscarAcaoPorNome(String nome) {
        return acaoRepository.buscarPorNome(nome);
    }

    @Override
    public List<Acao> listarAcoes() {
        return acaoRepository.listar();
    }

    @Override
    public void atualizarAcao(String nome, double novoPrecoFechamento) {
        Acao acao = acaoRepository.buscarPorNome(nome);
        if (acao != null) {
            acao.setPrecoFechamento(novoPrecoFechamento);
            acaoRepository.atualizar(acao);
        }
    }

    @Override
    public void deletarAcao(String nome) {
        Acao acao = acaoRepository.buscarPorNome(nome);
        if (acao != null) {
            acaoRepository.deletar(acao);
        }
    }
}
