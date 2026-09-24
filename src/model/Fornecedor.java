package model;

public class Fornecedor {

    private String razaoSocial;
    private String cnpj;
    private String dataCadastro;
    private String email;
    private String telefoneContato;
    private Endereco endereco;
    private boolean ativo;
    private String observacao;

    public Fornecedor() {
    }

    public Fornecedor(String razaoSocial, String cnpj, String dataCadastro, String email, String telefoneContato, Endereco endereco, boolean ativo, String observacao) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataCadastro = dataCadastro;
        this.email = email;
        this.telefoneContato = telefoneContato;
        this.endereco = endereco;
        this.ativo = ativo;
        this.observacao = observacao;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
