/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ProdutoDAO {
    static ArrayList<Produto> listaProduto = new ArrayList<>();
    
    Connection conn;
    Statement st;
    ResultSet rs;
    
    public ArrayList<Produto> fetchListaDB(){
        String query = "select * from produto";
         try{
            conn = Conexao.connect();
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                Produto p = new Produto();
                p.setNome(rs.getString("nomeproduto"));
                p.setQuantidade(rs.getInt("quantidade"));
                p.setDescricao(rs.getString("descricao"));
                listaProduto.add(p);
            }
            conn.close();
         }catch (SQLException e){
             System.out.println("Ocorreu um erro no método fetchListaDB:"+e.getMessage());
         }
         return listaProduto;
    }
    
    public void openConn(){
        try {
            conn = Conexao.connect();
            st = conn.createStatement();
        }catch(SQLException e){
            System.out.println("could not openConn: "+e.getMessage());
        }
    }
    
    public void closeConn(){
        try{
            conn.close();
        }catch(SQLException e){
            System.out.println("could not closeConn: "+e.getMessage());
        }
    }
    
    public void sqlUpdate(String query){
          try{
            openConn();
            st.executeUpdate(query);
            closeConn();
          }catch(SQLException e){
              System.out.println("Ocorreu um erro no método sqlUpdate: "+e.getMessage());
          }
    }
    
    public void addBatch(String query){
        try{
            if (conn == null){conn = Conexao.connect(); st = conn.createStatement();}
            st.addBatch(query);
        }catch(SQLException e){
            System.out.println("Ocorreu um erro em addBatch(): "+e.getMessage());
        }
    }
    
    public void closeBatch(){
        try{
            if (conn.isClosed() || conn == null){return;}
            st.executeBatch();
            conn.close();
            System.out.println("SQL batch sent successfully.");
        }catch(SQLException e){
            System.out.println("Ocorreu um erro em closeBatch(): "+e.getMessage());
        }
    }
    
    public void cancelBatch(){
        try{
            if (conn.isClosed()){return;}
            st.clearBatch();
            conn.close();
        }catch(SQLException e){
            System.out.println("Ocorreu um erro em cancelBatch(): "+e.getMessage());
        }
    }
        
    public static void setLista(ArrayList<Produto> al){
        listaProduto = al;
        System.out.println("lista em ProdutoDAO set");
    }
    
    public static void addLista(ArrayList<Produto> al){
        listaProduto.addAll(al);
        System.out.println("added to lista em ProdutoDAO");
    }
    
    public static ArrayList getLista(){
        return listaProduto;
    }
    
    public static void clearLista(){
        listaProduto.clear();
    }
}

