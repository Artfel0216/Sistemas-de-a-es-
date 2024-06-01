package entities;

public class Ordem {
    private int numero;
    private String tipo;
    private double quantidade;

    public Ordem() {}

    public Ordem(int numero, String tipo, double quantidade) {
        this.numero = numero;
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    // Getters e setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Ordem" +
                "\nNumero: " + numero +
                "\nTipo: " + tipo +
                "\nQuantidade: " + quantidade;
    }
}