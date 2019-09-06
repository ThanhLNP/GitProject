package hodon;

import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Sevices {
    public Connection connect;
    public void InsertRe(int id, String Name){
        Connect_JDBC newConnect= new Connect_JDBC();
        
        try {
            Statement statement = newConnect.getJDBC().createStatement();
            String sql="INSERT INTO newSV(id,name) VALUES ("+id+",'"+Name+"')";
            int rs=statement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Sevices.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        }
    }
    public void Update(int id, String Name){
        Connect_JDBC newConnect_JDBC= new Connect_JDBC();
        try {
            Statement statement= newConnect_JDBC.getJDBC().createStatement();
            String RsString="UPDATE newSV SET name='"+Name+"' WHERE id="+id;
            statement.executeUpdate(RsString);
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Sevices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void DeleteRe(int id){
        Connect_JDBC newConnect_JDBC= new Connect_JDBC();
        try {
            Statement statement= newConnect_JDBC.getJDBC().createStatement();
            String RsString="DELETE FROM newSV WHERE id="+id+"";
            statement.executeUpdate(RsString);
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Sevices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
