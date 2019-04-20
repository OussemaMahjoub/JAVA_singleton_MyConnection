/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton_myconnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mahjoub
 */
public class Singleton_MyConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        
        try {
        
        String requete4="Select * from wishlist  " ; 
           
            Statement st2 = MyConnection.getInstance().getCnx().createStatement();
            
            ResultSet rs=st2.executeQuery(requete4);
            
            if(rs.next())
            {                
                System.out.println(rs.getInt(1));
                }                                    
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
