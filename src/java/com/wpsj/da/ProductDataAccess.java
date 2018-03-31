/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wpsj.da;

import com.wpsj.entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;




/**
 *
 * @author User
 */

public class ProductDataAccess{
    
    private PreparedStatement searchStatement;
    
    private PreparedStatement getPreparedStatement() throws ClassNotFoundException,
                SQLException{
            if(searchStatement == null ){
                Connection connection = new DBConnection().getConnection();
                searchStatement
                        =connection.prepareStatement
                        ("SELECT pro_id, pro_name, pro_desc FROM ProductStore WHERE pro_name like ?");
            }
            return searchStatement;
    }
    public List<Product> getProductsByName(String name) {
        try{
            PreparedStatement statement = getSearchStatement();
            statement.setString(1, "%"+name+"%");
            ResultSet rs = statement.executeQuery();
            List<Product> product = new LinkedList<Product>();
            while(rs.next())
            {
                product.add(new Product(rs.getInt("pro_id"),
                    rs.getString("pro_name"), rs.getString("pro_desc")));
            }
            return product;
        } catch (Exception e){
           e.printStackTrace();
           return null;
        }
    }

    private PreparedStatement getSearchStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

}    

    
