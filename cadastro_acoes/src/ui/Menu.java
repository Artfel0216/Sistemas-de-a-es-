// Menu.java
package ui;

import entities.*;
import services.*;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private IClienteService clienteService;
    private IOrdemService ordemService;
    private ICorretoraService corretoraService;
    private IMercadoService mercadoService;
    private Scanner scanner;

    public Menu(IClienteService clienteService, IOrdemService ordemService, ICorretoraService corretoraService, IMercadoService mercadoService) {
        this.clienteService = clienteService;
        this.ordemService = ordemService;
        this.corretoraService = corretoraService;
        this.mercadoService = mercadoService;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int escolha;
        do {
            System.out.println("---- Menu ----");
            System.out.println("1. Gerenciar Clientes");
            System.out.println("2. Gerenciar Ordens");
            System.out.println("3. Gerenciar Corretoras");
            System.out.println("4. Gerenciar Mercados");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    menuClientes();
                    break;
                case 2:
                    menuOrdens();
                    break;
                case 3:
                    menuCorretoras();
                    break;
                case 4:
                    menuMercados();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (escolha != 0);
    }

    private void menuClientes() {
        int escolha;
        do {
            System.out.println("---- Gerenciar Clientes ----");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Buscar Cliente");
            System.out.println("3. Listar Clientes");
            System.out.println("4. Atualizar Cliente");
            System.out.println("5. Deletar Cliente");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    buscarCliente();
                    break;
                case 3:
                    listarClientes();
                    break;
                case 4:
                    atualizarCliente();
                    break;
                case 5:
                    deletarCliente();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (escolha != 0);
    }

    private void menuOrdens() {
        int escolha;
        do {
            System.out.println("---- Gerenciar Ordens ----");
            System.out.println("1. Cadastrar Ordem");
            System.out.println("2. Buscar Ordem");
            System.out.println("3. Listar Ordens");
            System.out.println("4. Atualizar Ordem");
            System.out.println("5. Deletar Ordem");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    cadastrarOrdem();
                    break;
                case 2:
                    buscarOrdem();
                    break;
                case 3:
                    listarOrdens();
                    break;
                case 4:
                    atualizarOrdem();
                    break;
                case 5:
                    deletarOrdem();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (escolha != 0);
    }

    private void menuCorretoras() {
        int escolha;
        do {
            System.out.println("---- Gerenciar Corretoras ----");
            System.out.println("1. Cadastrar Corretora");
            System.out.println("2. Buscar Corretora");
            System.out.println("3. Listar Corretoras");
            System.out.println("4. Atualizar Corretora");
            System.out.println("5. Deletar Corretora");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    cadastrarCorretora();
                    break;
                case 2:
                    buscarCorretora();
                    break;
                case 3:
                    listarCorretoras();
                    break;
                case 4:
                    atualizarCorretora();
                    break;
                case 5:
                    deletarCorretora();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (escolha != 0);
    }

    private void menuMercados() {
        int escolha;
        do {
            System.out.println("---- Gerenciar Mercados ----");
            System.out.println("1. Cadastrar Mercado");
            System.out.println("2. Buscar Mercado");
            System.out.println("3. Listar Mercados");
            System.out.println("4. Atualizar Mercado");
            System.out.println("5. Deletar Mercado");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    cadastrarMercado();
                    break;
                case 2:
                    buscarMercado();
                    break;
                case 3:
                    listarMercados();
                    break;
                case 4:
                    atualizarMercado();
                    break;
                case 5:
                    deletarMercado();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (escolha != 0);
    }

    private void cadastrarCliente() {
        System.out.println("---- Cadastrar Cliente ----");
        System.out.print("Nome do Cliente: ");
        String nome = scanner.nextLine();
        System.out.print("CPF do Cliente: ");
        String cpf = scanner.nextLine();
        clienteService.cadastrarCliente(nome, cpf);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private void buscarCliente() {
        System.out.println("---- Buscar Cliente ----");
        System.out.print("Nome do Cliente: ");
        String nome = scanner.nextLine();
        Cliente cliente = clienteService.buscarClientePorNome(nome);
        if (cliente != null) {
            System.out.println("Cliente encontrado: " + cliente);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }


    private void listarClientes() {
        List<Cliente> clientes = clienteService.listarClientes();
        System.out.println("---- Lista de Clientes ----");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    private void atualizarCliente() {
        System.out.println("---- Atualizar Cliente ----");
        System.out.print("Nome do Cliente que deseja atualizar: ");
        String nome = scanner.nextLine();
        Cliente cliente = clienteService.buscarClientePorNome(nome);
        if (cliente != null) {
            System.out.print("Novo CPF do Cliente: ");
            String novoCpf = scanner.nextLine();
            clienteService.atualizarCliente(nome, novoCpf);
            System.out.println("Cliente atualizado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }


    private void deletarCliente() {
        System.out.println("---- Deletar Cliente ----");
        System.out.print("Nome do Cliente que deseja deletar: ");
        String nome = scanner.nextLine();
        Cliente cliente = clienteService.buscarClientePorNome(nome);
        if (cliente != null) {
            System.out.print("Tem certeza que deseja deletar este cliente? (S/N): ");
            String confirmacao = scanner.nextLine().toUpperCase();
            if (confirmacao.equals("S")) {
                clienteService.deletarCliente(nome);
                System.out.println("Cliente deletado com sucesso!");
            } else {
                System.out.println("Operação de exclusão cancelada.");
            }
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private void cadastrarOrdem() {
        System.out.println("---- Cadastrar Ordem ----");
        System.out.print("Número da Ordem: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Tipo da Ordem: ");
        String tipo = scanner.nextLine();
        System.out.print("Quantidade da Ordem: ");
        double quantidade = scanner.nextDouble();
        ordemService.cadastrarOrdem(numero, tipo, quantidade);
        System.out.println("Ordem cadastrada com sucesso!");
    }

    private void buscarOrdem() {
        System.out.println("---- Buscar Ordem ----");
        System.out.print("Número da Ordem: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        Ordem ordem = ordemService.buscarOrdemPorNumero(numero);
        if (ordem != null) {
            System.out.println("Ordem encontrada: " + ordem);
        } else {
            System.out.println("Ordem não encontrada.");
        }
    }

    private void listarOrdens() {
        List<Ordem> ordens = ordemService.listarOrdens();
        System.out.println("---- Lista de Ordens ----");
        for (Ordem ordem : ordens) {
            System.out.println(ordem);
        }
    }

    private void atualizarOrdem() {
        System.out.println("---- Atualizar Ordem ----");
        System.out.print("Número da Ordem que deseja atualizar: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        Ordem ordem = ordemService.buscarOrdemPorNumero(numero);
        if (ordem != null) {
            System.out.print("Novo Tipo da Ordem: ");
            String novoTipo = scanner.nextLine();
            System.out.print("Nova Quantidade da Ordem: ");
            double novaQuantidade = scanner.nextDouble();
            ordemService.atualizarOrdem(numero, novoTipo, novaQuantidade);
            System.out.println("Ordem atualizada com sucesso!");
        } else {
            System.out.println("Ordem não encontrada.");
        }
    }

    private void deletarOrdem() {
        System.out.println("---- Deletar Ordem ----");
        System.out.print("Número da Ordem que deseja deletar: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        Ordem ordem = ordemService.buscarOrdemPorNumero(numero);
        if (ordem != null) {
            System.out.print("Tem certeza que deseja deletar esta ordem? (S/N): ");
            String confirmacao = scanner.nextLine().toUpperCase();
            if (confirmacao.equals("S")) {
                ordemService.deletarOrdem(numero);
                System.out.println("Ordem deletada com sucesso!");
            } else {
                System.out.println("Operação de exclusão cancelada.");
            }
        } else {
            System.out.println("Ordem não encontrada.");
        }
    }

    private void cadastrarCorretora() {
        System.out.println("---- Cadastrar Corretora ----");
        System.out.print("Nome da Corretora: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço da Corretora: ");
        String endereco = scanner.nextLine();
        corretoraService.cadastrarCorretora(nome, endereco);
        System.out.println("Corretora cadastrada com sucesso!");
    }

    private void buscarCorretora() {
        System.out.println("---- Buscar Corretora ----");
        System.out.print("Nome da Corretora: ");
        String nome = scanner.nextLine();
        Corretora corretora = corretoraService.buscarCorretoraPorNome(nome);
        if (corretora != null) {
            System.out.println("Corretora encontrada: " + corretora);
        } else {
            System.out.println("Corretora não encontrada.");
        }
    }

    private void listarCorretoras() {
        List<Corretora> corretoras = corretoraService.listarCorretoras();
        System.out.println("---- Lista de Corretoras ----");
        for (Corretora corretora : corretoras) {
            System.out.println(corretora);
        }
    }

    private void atualizarCorretora() {
        System.out.println("---- Atualizar Corretora ----");
        System.out.print("Nome da Corretora que deseja atualizar: ");
        String nome = scanner.nextLine();
        Corretora corretora = corretoraService.buscarCorretoraPorNome(nome);
        if (corretora != null) {
            System.out.print("Novo Endereço da Corretora: ");
            String novoEndereco = scanner.nextLine();
            corretoraService.atualizarCorretora(nome, novoEndereco);
            System.out.println("Corretora atualizada com sucesso!");
        } else {
            System.out.println("Corretora não encontrada.");
        }
    }

    private void deletarCorretora() {
        System.out.println("---- Deletar Corretora ----");
        System.out.print("Nome da Corretora que deseja deletar: ");
        String nome = scanner.nextLine();
        Corretora corretora = corretoraService.buscarCorretoraPorNome(nome);
        if (corretora != null) {
            System.out.print("Tem certeza que deseja deletar esta corretora? (S/N): ");
            String confirmacao = scanner.nextLine().toUpperCase();
            if (confirmacao.equals("S")) {
                corretoraService.deletarCorretora(nome);
                System.out.println("Corretora deletada com sucesso!");
            } else {
                System.out.println("Operação de exclusão cancelada.");
            }
        } else {
            System.out.println("Corretora não encontrada.");
        }
    }

    private void cadastrarMercado() {
        System.out.println("---- Cadastrar Mercado ----");
        System.out.print("Nome do Mercado: ");
        String nome = scanner.nextLine();
        System.out.print("Localização do Mercado: ");
        String localizacao = scanner.nextLine();
        mercadoService.cadastrarMercado(nome, localizacao);
        System.out.println("Mercado cadastrado com sucesso!");
    }

    private void buscarMercado() {
        System.out.println("---- Buscar Mercado ----");
        System.out.print("Nome do Mercado: ");
        String nome = scanner.nextLine();
        Mercado mercado = mercadoService.buscarMercadoPorNome(nome);
        if (mercado != null) {
            System.out.println("Mercado encontrado: " + mercado);
        } else {
            System.out.println("Mercado não encontrado.");
        }
    }

    private void listarMercados() {
        List<Mercado> mercados = mercadoService.listarMercados();
        System.out.println("---- Lista de Mercados ----");
        for (Mercado mercado : mercados) {
            System.out.println(mercado);
        }
    }

    private void atualizarMercado() {
        System.out.println("---- Atualizar Mercado ----");
        System.out.print("Nome do Mercado que deseja atualizar: ");
        String nome = scanner.nextLine();
        Mercado mercado = mercadoService.buscarMercadoPorNome(nome);
        if (mercado != null) {
            System.out.print("Nova Localização do Mercado: ");
            String novaLocalizacao = scanner.nextLine();
            mercadoService.atualizarMercado(nome, novaLocalizacao);
            System.out.println("Mercado atualizado com sucesso!");
        } else {
            System.out.println("Mercado não encontrado.");
        }
    }

    private void deletarMercado() {
        System.out.println("---- Deletar Mercado ----");
        System.out.print("Nome do Mercado que deseja deletar: ");
        String nome = scanner.nextLine();
        Mercado mercado = mercadoService.buscarMercadoPorNome(nome);
        if (mercado != null) {
            System.out.print("Tem certeza que deseja deletar este mercado? (S/N): ");
            String confirmacao = scanner.nextLine().toUpperCase();
            if (confirmacao.equals("S")) {
                mercadoService.deletarMercado(nome);
                System.out.println("Mercado deletado com sucesso!");
            } else {
                System.out.println("Operação de exclusão cancelada.");
            }
        } else {
            System.out.println("Mercado não encontrado.");
        }
    }

}
