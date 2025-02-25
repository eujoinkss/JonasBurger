
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexao {
    
    public Connection conectar(){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/caixatotem2","root","fsj110370T@");
            return con;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados! \n" + ex.getMessage());
            return null;
        }
    }
}
