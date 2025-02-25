
package data;


public class Pedido {
    private int idPedido;
    private Conta Conta_id;
    private Lanche Lanche_id;
    private Bebida Bebida_id;
    private Acompanhamento Acompanhamento_id;
    private Sobremesa Sobremesa_id;
    private String nomecliente;
    private double valortotal;
    private String formapagamento;
    private int pontosusados;
    private double desconto;
    private double gorjeta;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Conta getConta_id() {
        return Conta_id;
    }

    public void setConta_id(Conta Conta_id) {
        this.Conta_id = Conta_id;
    }

    public Lanche getLanche_id() {
        return Lanche_id;
    }

    public void setLanche_id(Lanche Lanche_id) {
        this.Lanche_id = Lanche_id;
    }

    public Bebida getBebida_id() {
        return Bebida_id;
    }

    public void setBebida_id(Bebida Bebida_id) {
        this.Bebida_id = Bebida_id;
    }

    public Acompanhamento getAcompanhamento_id() {
        return Acompanhamento_id;
    }

    public void setAcompanhamento_id(Acompanhamento Acompanhamento_id) {
        this.Acompanhamento_id = Acompanhamento_id;
    }

    public Sobremesa getSobremesa_id() {
        return Sobremesa_id;
    }

    public void setSobremesa_id(Sobremesa Sobremesa_id) {
        this.Sobremesa_id = Sobremesa_id;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    public String getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(String formapagamento) {
        this.formapagamento = formapagamento;
    }

    public int getPontosusados() {
        return pontosusados;
    }

    public void setPontosusados(int pontosusados) {
        this.pontosusados = pontosusados;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getGorjeta() {
        return gorjeta;
    }

    public void setGorjeta(double gorjeta) {
        this.gorjeta = gorjeta;
    }
}
