
package ces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioDAO {
    public static ArrayList<Usuario> listaUsuario = new ArrayList<>();
    
    Connection conn;
    Statement st;
    ResultSet rs;
    
     public ArrayList<Usuario> fetchListaDB(){ //unused for now
        String query = "select * from usuario";
         try{
            conn = Conexao.connect();
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                Usuario u = new Usuario();
                u.setNome(rs.getString("nome"));
                u.setPass(rs.getString("senha"));
                    int acesso_id = rs.getInt("acesso_id");
                    switch(acesso_id){
                        case 1: u.setAcesso("Admin");break;
                        case 2: u.setAcesso("Usuário");break;
                        case 3: u.setAcesso("Visitante");break;
                    }
                listaUsuario.add(u);
            }
         }catch (SQLException e){
             System.out.println("Ocorreu um erro no método UsuarioDAO.fetchListaDB:"+e.getMessage());
         }
         return listaUsuario;
         
    }
    
    public static void setLista(ArrayList<Usuario> al){
        listaUsuario = al;
        System.out.println("lista em UsuarioDAO set");
    }
    
    public static void addLista(ArrayList<Usuario> al){
        listaUsuario.addAll(al);
        System.out.println("added to lista em UsuarioDAO");
    }
    
    public static ArrayList getLista(){
        return listaUsuario;
    }
    
}
