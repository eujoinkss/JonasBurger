
package data;


public class Acompanhamento {
    private int id_acompanhamento;
    private String nome;
    private double valor;

    public int getId_acompanhamento() {
        return id_acompanhamento;
    }

    public void setId_acompanhamento(int id_acompanhamento) {
        this.id_acompanhamento = id_acompanhamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString(){
        return this.nome + " | R$" + this.valor;
    }
}
