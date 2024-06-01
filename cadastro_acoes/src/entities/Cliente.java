package entities;

public class Cliente extends Pessoa{
    private String telefone;
    private String endereco;

    public Cliente() {
        super();
    }

    public Cliente (String nome, String cpf, String telefone, String endereco){
        super(nome, cpf);
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    // Getters e setters


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente" +
                "\nNome: " + getNome() +
                "\nCPF: " + getCpf();
    }
}