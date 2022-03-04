/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import manager.sach;


/**
 *
 * @author trunghuynh
 */
public class sachDao {

    
    public List<sach> getALLSach(){
            List<sach> listSach = new ArrayList<sach>();
            
            Connection connection = JDBCConnection.getJDBCConnection();
            String sql = "select * from sach";
            try {
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            
            //preparedStatement.setInt(1,5);
            
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                sach a = new sach();
                
                a.setIdS(rs.getString("idS"));
                a.setTenS(rs.getString("tenS"));
                a.setTacGia(rs.getString("tacGia"));
                a.setSoTrang(rs.getString("soTrang"));
                a.setTenNxb(rs.getString("tenNxb"));
                a.setSoBanPhatHanh(rs.getString("soBanPhatHanh"));
               
                
                listSach.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
            return listSach;
    }
//    public static void selectRecords() {
//        Connection connection = JDBCConnection.getJDBCConnection();
//        
//        String sql = "select * from bao ";
//         
//        try {
//            PreparedStatement preparedStatement= connection.prepareStatement(sql);
//            
//            //preparedStatement.setInt(1,5);
//            
//            ResultSet rs = preparedStatement.executeQuery();
//            while(rs.next()){
//                System.out.println(rs.getInt("idB") + rs.getString("ngayPhatHanh")+ rs.getString("nxb")+ rs.getInt("soBanPhatHanh"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    
    public static void insertSach(sach a){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "insert into sach (idS,tenS,tacGia,soTrang,tenNxb,soBanPhatHanh) values(?,?,?,?,?,?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, a.getIdS());
            preparedStatement.setString(2, a.getTenS());
            preparedStatement.setString(3, a.getTacGia());
            preparedStatement.setString(4, a.getSoTrang());
            preparedStatement.setString(5, a.getTenNxb());
            preparedStatement.setString(6, a.getSoBanPhatHanh());
            
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void UpdateSach(sach a){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "update sach set tenS=?,tacGia=?,soTrang=?,tenNxb=?,soBanPhatHanh=? where idS = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(6, a.getIdS());
            preparedStatement.setString(1, a.getTenS());
            preparedStatement.setString(2, a.getTacGia());
            preparedStatement.setString(3, a.getSoTrang());
            preparedStatement.setString(4, a.getTenNxb());
            preparedStatement.setString(5, a.getSoBanPhatHanh());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void deleteSach(sach a){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "delete from sach where idS = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, a.getIdS());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
}
