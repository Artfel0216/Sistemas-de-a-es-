package entities;

public class Corretora {
    private String nome;
    private String endereco;

    public Corretora() {}

    public Corretora(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Corretora" +
                "\nNome: " + nome +
                "\nEndereco: " + endereco;
    }
}