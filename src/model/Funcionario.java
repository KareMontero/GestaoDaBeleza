package model;

public class Funcionario {

    private String nome;
    private String cpf;
    private String dataNascimento;
    private String email;
    private String telefoneContato;
    private Endereco endereco;
    private String funcao;
    private String carteiraTrabalho;
    private String dataContratacao;
    private String disponibilidadeDeHorario;
    private double valorDoServico;
    private boolean ativo;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String dataNascimento, String email, String telefoneContato, Endereco endereco, String funcao, String carteiraTrabalho, String dataContratacao, String disponibilidadeDeHorario, double valorDoServico, boolean ativo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefoneContato = telefoneContato;
        this.endereco = endereco;
        this.funcao = funcao;
        this.carteiraTrabalho = carteiraTrabalho;
        this.dataContratacao = dataContratacao;
        this.disponibilidadeDeHorario = disponibilidadeDeHorario;
        this.valorDoServico = valorDoServico;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getDisponibilidadeDeHorario() {
        return disponibilidadeDeHorario;
    }

    public void setDisponibilidadeDeHorario(String disponibilidadeDeHorario) {
        this.disponibilidadeDeHorario = disponibilidadeDeHorario;
    }

    public double getValorDoServico() {
        return valorDoServico;
    }

    public void setValorDoServico(double valorDoServico) {
        this.valorDoServico = valorDoServico;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
