
package dao;

import connection.Conexao;
import data.Lanche;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LancheDAO {
    
    private Conexao conexao;
    private Connection con;
    
    public LancheDAO(){
        this.conexao = new Conexao();
        this.con = this.conexao.conectar();
    }
    
    public List<Lanche> getLanches(){
        String sql = "select * from lanche";
        
        try{
            PreparedStatement st = this.con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            List<Lanche> listaL = new ArrayList<>();
            
            while(rs.next()){
                Lanche l = new Lanche();
                
                l.setId_lanche(rs.getInt("idLanche"));
                l.setNome(rs.getString("nome"));
                l.setIngredientes(rs.getString("ingredientes"));
                l.setValor(rs.getDouble("valor"));
                
                listaL.add(l);
            }
            return listaL;
        }catch(Exception ex){
            return null;
        }
    }
}
