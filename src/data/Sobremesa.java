
package data;


public class Sobremesa {
    private int id_sobremesa;
    private String nome;
    private double valor;
    private String sabor;


    public int getId_sobremesa() {
        return id_sobremesa;
    }

    public void setId_sobremesa(int id_sobremesa) {
        this.id_sobremesa = id_sobremesa;
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

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    @Override
    public String toString(){
        return this.nome + " de " + this.sabor + " | R$" + this.valor;
    }
}
