package services;

import entities.Mercado;
import repositories.IMercadoRepository;
import java.util.List;

public class MercadoServiceImpl implements IMercadoService {
    private IMercadoRepository mercadoRepository;

    public MercadoServiceImpl(IMercadoRepository mercadoRepository) {
        this.mercadoRepository = mercadoRepository;
    }

    @Override
    public void cadastrarMercado(String nome, String localizacao) {
        Mercado mercado = new Mercado(nome, localizacao);
        mercadoRepository.cadastrar(mercado);
    }

    @Override
    public Mercado buscarMercadoPorNome(String nome) {
        return mercadoRepository.buscarPorNome(nome);
    }

    @Override
    public List<Mercado> listarMercados() {
        return mercadoRepository.listar();
    }

    @Override
    public void atualizarMercado(String nome, String novaLocalizacao) {
        Mercado mercado = mercadoRepository.buscarPorNome(nome);
        if (mercado != null) {
            mercado.setLocalizacao(novaLocalizacao);
            mercadoRepository.atualizar(mercado);
        }
    }

    @Override
    public void deletarMercado(String nome) {
        Mercado mercado = mercadoRepository.buscarPorNome(nome);
        if (mercado != null) {
            mercadoRepository.deletar(mercado);
        }
    }
}