package atividade2;
public class Funcionario {

    private String nome;
    private int matricula;
    private double salarioBase;
    private String dataAdmissao;

    public Funcionario(String nome, int matricula, double salarioBase, String dataAdmissao) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public double calcularDesconto() {
        return salarioBase * 0.08;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
               "\nMatrícula: " + matricula +
               "\nSalário Base: R$ " + salarioBase +
               "\nData de Admissão: " + dataAdmissao +
               "\nSalário: R$ " + calcularSalario() +
               "\nDesconto: R$ " + calcularDesconto();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}