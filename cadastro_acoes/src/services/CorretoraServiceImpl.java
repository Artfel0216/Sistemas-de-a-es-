package services;

import entities.Corretora;
import repositories.ICorretoraRepository;
import java.util.List;

public class CorretoraServiceImpl implements ICorretoraService {
    private ICorretoraRepository corretoraRepository;

    public CorretoraServiceImpl(ICorretoraRepository corretoraRepository) {
        this.corretoraRepository = corretoraRepository;
    }

    @Override
    public void cadastrarCorretora(String nome, String endereco) {
        Corretora corretora = new Corretora(nome, endereco);
        corretoraRepository.cadastrar(corretora);
    }

    @Override
    public Corretora buscarCorretoraPorNome(String nome) {
        return corretoraRepository.buscarPorNome(nome);
    }

    @Override
    public List<Corretora> listarCorretoras() {
        return corretoraRepository.listar();
    }

    @Override
    public void atualizarCorretora(String nome, String novoEndereco) {
        Corretora corretora = corretoraRepository.buscarPorNome(nome);
        if (corretora != null) {
            corretora.setEndereco(novoEndereco);
            corretoraRepository.atualizar(corretora);
        }
    }

    @Override
    public void deletarCorretora(String nome) {
        Corretora corretora = corretoraRepository.buscarPorNome(nome);
        if (corretora != null) {
            corretoraRepository.deletar(corretora);
        }
    }
}
