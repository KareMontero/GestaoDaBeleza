package model;

public class Produto {

    private String nome;
    private String descricao;
    private String categoria;
    private int qtidadeAtual;
    private int qtidadeProduto;
    private double precoProduto;
    private String dataValidade;
    private boolean ativo;
    private Fornecedor fornecedor;

    public Produto() {
    }

    public Produto(String nome, String descricao, String categoria, int qtidadeAtual, int qtidadeProduto, double precoProduto, String dataValidade, boolean ativo, Fornecedor fornecedor) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.qtidadeAtual = qtidadeAtual;
        this.qtidadeProduto = qtidadeProduto;
        this.precoProduto = precoProduto;
        this.dataValidade = dataValidade;
        this.ativo = ativo;
        this.fornecedor = fornecedor;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQtidadeAtual() {
        return qtidadeAtual;
    }

    public void setQtidadeAtual(int qtidadeAtual) {
        this.qtidadeAtual = qtidadeAtual;
    }

    public int getQtidadeProduto() {
        return qtidadeProduto;
    }

    public void setQtidadeProduto(int qtidadeProduto) {
        this.qtidadeProduto = qtidadeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

}
