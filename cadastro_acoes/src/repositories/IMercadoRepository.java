package repositories;

import entities.Mercado;
import java.util.List;

public interface IMercadoRepository {
    void cadastrar(Mercado mercado);
    Mercado buscarPorNome(String nome);
    List<Mercado> listar();
    void atualizar(Mercado mercado);
    void deletar(Mercado mercado);
}