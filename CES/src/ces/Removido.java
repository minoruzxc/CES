
package ces;

public class Removido {
    public int id;
    public int sqlId;
    public int quantidade;
    public String nome;
    public String comentario;
    
public Removido (int id,int quantidade,String nome){
    this.id = id;
    this.quantidade = quantidade;
    this.nome = nome;
}    

public Removido(){
    
}

    public int getSqlId() {
        return sqlId;
    }

    public void setSqlId(int sqlId) {
        this.sqlId = sqlId;
    }



    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    
}


