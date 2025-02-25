
package dao;

import connection.Conexao;
import data.Sobremesa;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class SobremesaDAO {
    private Conexao conexao;
    private Connection con;
    
    public SobremesaDAO(){
        this.conexao = new Conexao();
        this.con = this.conexao.conectar();
    }
    
    public List<Sobremesa> getSob(){
      String sql = "select * from sobremesa";
      
      try{
          PreparedStatement st = this.con.prepareStatement(sql);
          ResultSet rs = st.executeQuery();
          List<Sobremesa> listaS = new ArrayList<>();
          
          while(rs.next()){
              Sobremesa s = new Sobremesa();
              
              s.setId_sobremesa(rs.getInt("idSobremesa"));
              s.setNome(rs.getString("nome"));
              s.setSabor(rs.getString("sabor"));
              s.setValor(rs.getDouble("valor"));
              
              listaS.add(s);
          }
          return listaS;
      }catch(Exception ex){
          return null;
      }
    }
}
