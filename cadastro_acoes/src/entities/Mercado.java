package entities;

public class Mercado {
    private String nome;
    private String localizacao;

    public Mercado() {}

    public Mercado(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "Mercado" +
                "\nNome:" + nome +
                "\nLocalizacao='" + localizacao;
    }
}