
package dao;

import connection.Conexao;
import data.Acompanhamento;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AcompanhamentoDAO {
    private Conexao conexao;
    private Connection con;
    
    public AcompanhamentoDAO(){
        this.conexao = new Conexao();
        this.con = this.conexao.conectar();
    }
    
    public List<Acompanhamento> getAc(){
        String sql = "select*from acompanhamento";
        
        try{
          PreparedStatement st = this.con.prepareStatement(sql);
          ResultSet rs = st.executeQuery();
          List<Acompanhamento> listaA = new ArrayList<>();
          
          while(rs.next()){
              Acompanhamento a = new Acompanhamento();
              
              a.setId_acompanhamento(rs.getInt("idAcompanhamento"));
              a.setNome(rs.getString("nome"));
              a.setValor(rs.getDouble("valor"));
              
              listaA.add(a);
          }
          return listaA;
          
        }catch(Exception ex){
            return null;
        }
    }
}
