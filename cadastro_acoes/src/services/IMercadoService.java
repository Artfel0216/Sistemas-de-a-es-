package services;

import entities.Mercado;
import java.util.List;

public interface IMercadoService {
    void cadastrarMercado(String nome, String localizacao);
    Mercado buscarMercadoPorNome(String nome);
    List<Mercado> listarMercados();
    void atualizarMercado(String nome, String novaLocalizacao);
    void deletarMercado(String nome);
}