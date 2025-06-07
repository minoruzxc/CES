
package ces;

public class Produto {
    public String nome;
    public String descricao;
    public int quantidade;
    public int sqlId;
    

    public Produto() {
    }
    
    public Produto(Produto p){
        this.descricao = p.getDescricao();
        this.nome = p.getNome();
        this.quantidade = p.getQuantidade();
        this.sqlId = p.getSqlId();
    }

    public int getSqlId() {
        return sqlId;
    }

    public void setSqlId(int sqlId) {
        this.sqlId = sqlId;
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


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
