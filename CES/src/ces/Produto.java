
package ces;

public class Produto {
    public String nome;
    public String descricao;
    public int quantidade;
    

    public Produto() {
    }
    
    public Produto(Produto p){
        this.descricao = p.getDescricao();
        this.nome = p.getNome();
        this.quantidade = p.getQuantidade();
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
