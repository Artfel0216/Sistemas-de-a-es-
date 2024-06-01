// Acao.java

package entities;

public class Acao {
    private String nome;
    private double precoFechamento;

    // Construtor padrão
    public Acao() {}

    // Construtor com todos os atributos
    // SOBRECARGA DE CONSTRUTOR
    public Acao(String nome, double precoFechamento) {
        this.nome = nome;
        this.precoFechamento = precoFechamento;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoFechamento() {
        return precoFechamento;
    }

    public void setPrecoFechamento(double precoFechamento) {
        this.precoFechamento = precoFechamento;
    }

    // Sobrecarga do método toString para facilitar a visualização
    @Override
    public String toString() {
        return "Acao: " +
                "\nNome: " + nome  +
                "\nPreco de Fechamento: " + precoFechamento +
                '\n';
    }
}
