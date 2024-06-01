// Main.java
package ui;

import repositories.*;
import services.*;

public class Main {
    public static void main(String[] args) {
        // Criando os repositórios e serviços para cada entidade
        IClienteRepository clienteRepository = new ClienteRepositoryImpl();
        IClienteService clienteService = new ClienteServiceImpl(clienteRepository);

        IOrdemRepository ordemRepository = new OrdemRepositoryImpl();
        IOrdemService ordemService = new OrdemServiceImpl(ordemRepository);

        ICorretoraRepository corretoraRepository = new CorretoraRepositoryImpl();
        ICorretoraService corretoraService = new CorretoraServiceImpl(corretoraRepository);

        IMercadoRepository mercadoRepository = new MercadoRepositoryImpl();
        IMercadoService mercadoService = new MercadoServiceImpl(mercadoRepository);

        // Criando o menu e iniciando a interação com o usuário
        Menu menu = new Menu(clienteService, ordemService, corretoraService, mercadoService);
        menu.exibirMenu();
    }
}
