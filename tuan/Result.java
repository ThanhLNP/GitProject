
package hodon;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Result {
    nhanvien new_NV= new nhanvien();
    ArrayList<nhanvien> Result_Re(){
        ArrayList<nhanvien> addResult= new ArrayList<nhanvien>();
        ResultSet getResult = null;
        Connect_JDBC connection= new Connect_JDBC();
        try {
            Statement statement= connection.getJDBC().createStatement();
            String rs="SELECT * FROM `sinhvien`";
            getResult=statement.executeQuery(rs);
            while(getResult.next()){
                nhanvien A= new nhanvien();
                A.Name=getResult.getString(2);
                addResult.add(A);
            }
            //return addResult;
        } catch (SQLException ex) {
            Logger.getLogger(Result.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(getResult!=null){
                try {
                    getResult.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Result.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return addResult;
    }
    public void Result_Re(int id){
        Connect_JDBC connection= new Connect_JDBC();
        try {
            Statement statement= connection.getJDBC().createStatement();
            String rs="SELECT * FROM `sinhvien` WHERE id="+id;
            ResultSet getResult=statement.executeQuery(rs);
            while(getResult.next()){
                System.out.println(getResult.getInt(1)+" "+getResult.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Result.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
