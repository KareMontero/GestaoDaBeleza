
package model;

public class Endereco {

    private String endereco;
    private String numero;
    private String bairro;
    private String enderecoComplemento;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco() {
    }

    public Endereco(String endereco, String numero, String bairro, String enderecoComplemento, String cep, String cidade, String estado) {
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.enderecoComplemento = enderecoComplemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEnderecoComplemento() {
        return enderecoComplemento;
    }

    public void setEnderecoComplemento(String enderecoComplemento) {
        this.enderecoComplemento = enderecoComplemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
