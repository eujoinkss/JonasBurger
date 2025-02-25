
package dao;

import connection.Conexao;
import data.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class PedidoDAO {
    private Conexao conexao;
    private Connection con;
    
    public PedidoDAO(){
        this.conexao = new Conexao();
        this.con = this.conexao.conectar();
    }
    
    public void registrarPedido(Pedido p){
        String sql = "insert into Pedido(Conta_id, Lanche_id, Bebida_id, Acompanhamento_id, Sobremesa_id, nomecliente, valortotal, formapagamento, pontosusados, desconto, gorjeta)"
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            PreparedStatement st = this.con.prepareStatement(sql);
            
            if(p.getConta_id() != null){
                st.setInt(1, p.getConta_id().getIdConta());
            }else{
                st.setNull(1, java.sql.Types.INTEGER);
            }
            
            if(p.getLanche_id() != null){
                st.setInt(2, p.getLanche_id().getId_lanche());
            }else{
                st.setNull(2, java.sql.Types.INTEGER);
            }
            
            if(p.getBebida_id() != null){
                st.setInt(3, p.getBebida_id().getId_bebida());
            }else{
                st.setNull(3, java.sql.Types.INTEGER);
            }
            
            if(p.getAcompanhamento_id() != null){
                st.setInt(4, p.getAcompanhamento_id().getId_acompanhamento());
            }else{
                st.setNull(4, java.sql.Types.INTEGER);
            }
            
            if(p.getSobremesa_id() != null){
                st.setInt(5, p.getSobremesa_id().getId_sobremesa());
            }else{
                st.setNull(5, java.sql.Types.INTEGER);
            }
            
            st.setString(6, p.getNomecliente());
            st.setDouble(7, p.getValortotal());
            st.setString(8, p.getFormapagamento());
            st.setInt(9, p.getPontosusados());
            st.setDouble(10, p.getDesconto());
            st.setDouble(11, p.getGorjeta());
            st.execute();
            
        }catch(Exception ex){
            System.out.println("Erro ao registrar pedido! "+ ex.getMessage());
        }
        
    }
}
