package entidades;

import categoria.Categoria;

public class Produto {

    private String codigo;
    private String descricao;
    private double precoVenda;
    private int quantidadeEmEstoque;
    private Categoria categoriaProduto;

    public Produto(String codigo, String descricao, double precoVenda, int quantidadeEmEstoque, Categoria categoriaProduto){
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.categoriaProduto = categoriaProduto;
    }

    public Produto(){
        this.codigo = "";
        this.descricao = "";
        this.precoVenda = 0;
        this.quantidadeEmEstoque = 0;
        this.categoriaProduto = Categoria.SEM_CATEGORIA;
    }

    @Override
    public String toString() {
        return "Produto: " + "codigo = " + codigo + ", descricao = " + descricao + ", precoVenda = " + precoVenda + ", quantidadeEmEstoque=" + quantidadeEmEstoque + ", categoriaProduto=" + categoriaProduto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Categoria getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(Categoria categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }
}
