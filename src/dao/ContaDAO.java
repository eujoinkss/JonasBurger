/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.Conexao;
import data.Conta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author julro
 */
public class ContaDAO {
        private Conexao conexao;
        private Connection con;
    
    public ContaDAO(){
        this.conexao = new Conexao();
        this.con = this.conexao.conectar();
    }
    
    public Conta buscarConta(Conta c){
        String sql = "Select * from Conta c where c.login = ? and c.senha = ?";
        Conta contaEncontrada = null;
        
        try{
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, c.getLogin());
            st.setString(2, c.getSenha());
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                contaEncontrada = new Conta();
                contaEncontrada.setIdConta(rs.getInt("idConta"));
                contaEncontrada.setNome(rs.getString("nome"));
                contaEncontrada.setLogin(rs.getString("login"));
                contaEncontrada.setSenha(rs.getString("senha"));
                contaEncontrada.setPontos(rs.getInt("pontos"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro! "+ ex.getMessage());
        }
        
        return contaEncontrada;
    }
    
    public void adicionarPontos(int idConta, int qtdPontos){
        String sql = "update conta set pontos = ? where idConta = ?";
        
        try{
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, qtdPontos);
            st.setInt(2, idConta);
            st.execute();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro! "+ ex.getMessage());
        }
    }
}
