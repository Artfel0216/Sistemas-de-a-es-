package repositories;

import entities.Ordem;
import java.util.List;

public interface IOrdemRepository {
    void cadastrar(Ordem ordem);
    Ordem buscarPorNumero(int numero);
    List<Ordem> listar();
    void atualizar(Ordem ordem);
    void deletar(Ordem ordem);
}