package repositories;

import entities.Corretora;
import java.util.List;

public interface ICorretoraRepository {
    void cadastrar(Corretora corretora);
    Corretora buscarPorNome(String nome);
    List<Corretora> listar();
    void atualizar(Corretora corretora);
    void deletar(Corretora corretora);
}