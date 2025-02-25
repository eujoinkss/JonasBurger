
package dao;

import connection.Conexao;
import data.Bebida;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BebidaDAO {
    private Conexao conexao;
    private Connection con;
    
    public BebidaDAO(){
        this.conexao = new Conexao();
        this.con = this.conexao.conectar();
    }
    
    public List<Bebida> getBebidas(){
        String sql = "select * from bebida";
        
        try{
            PreparedStatement st = this.con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            List<Bebida> listaB = new ArrayList<>();
            
            while(rs.next()){
                Bebida b = new Bebida();
                
                b.setId_bebida(rs.getInt("idBebida"));
                b.setNome(rs.getString("nome"));
                b.setQuantidade(rs.getInt("quantidade"));
                b.setValor(rs.getDouble("valor"));
                
                listaB.add(b);
            }
            return listaB;
            
        }catch(Exception ex){
           return null; 
        }
    }
}
