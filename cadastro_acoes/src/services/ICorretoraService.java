package services;

import entities.Corretora;
import java.util.List;

public interface ICorretoraService {
    void cadastrarCorretora(String nome, String endereco);
    Corretora buscarCorretoraPorNome(String nome);
    List<Corretora> listarCorretoras();
    void atualizarCorretora(String nome, String novoEndereco);
    void deletarCorretora(String nome);
}