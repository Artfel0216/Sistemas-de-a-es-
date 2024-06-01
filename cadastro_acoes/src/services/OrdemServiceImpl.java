package services;

import entities.Ordem;
import repositories.IOrdemRepository;
import java.util.List;

public class OrdemServiceImpl implements IOrdemService {
    private IOrdemRepository ordemRepository;

    public OrdemServiceImpl(IOrdemRepository ordemRepository) {
        this.ordemRepository = ordemRepository;
    }

    @Override
    public void cadastrarOrdem(int numero, String tipo, double quantidade) {
        Ordem ordem = new Ordem(numero, tipo, quantidade);
        ordemRepository.cadastrar(ordem);
    }

    @Override
    public Ordem buscarOrdemPorNumero(int numero) {
        return ordemRepository.buscarPorNumero(numero);
    }

    @Override
    public List<Ordem> listarOrdens() {
        return ordemRepository.listar();
    }

    @Override
    public void atualizarOrdem(int numero, String novoTipo, double novaQuantidade) {
        Ordem ordem = ordemRepository.buscarPorNumero(numero);
        if (ordem != null) {
            ordem.setTipo(novoTipo);
            ordem.setQuantidade(novaQuantidade);
            ordemRepository.atualizar(ordem);
        }
    }

    @Override
    public void deletarOrdem(int numero) {
        Ordem ordem = ordemRepository.buscarPorNumero(numero);
        if (ordem != null) {
            ordemRepository.deletar(ordem);
        }
    }
}
