/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ces;

import java.util.ArrayList;


public class ProdutoDAO {
    static ArrayList<Produto> listaProduto = new ArrayList<>();
    
    
    public ArrayList<Produto> listarProduto(){
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

