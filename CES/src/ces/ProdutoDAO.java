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
         }catch (SQLException e){
             System.out.println("Ocorreu um erro no método fetchListaDB:"+e.getMessage());
         }
         return listaProduto;
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

