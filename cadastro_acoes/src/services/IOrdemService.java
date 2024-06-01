package services;

import entities.Ordem;
import java.util.List;

public interface IOrdemService {
    void cadastrarOrdem(int numero, String tipo, double quantidade);
    Ordem buscarOrdemPorNumero(int numero);
    List<Ordem> listarOrdens();
    void atualizarOrdem(int numero, String novoTipo, double novaQuantidade);
    void deletarOrdem(int numero);
}