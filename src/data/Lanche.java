/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author julro
 */
public class Lanche {
    private int id_lanche;
    private String nome;
    private String ingredientes;
    private double valor;


    public int getId_lanche() {
        return id_lanche;
    }

    public void setId_lanche(int id_lanche) {
        this.id_lanche = id_lanche;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
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
