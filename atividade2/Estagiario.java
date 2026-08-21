package atividade2;

public class Estagiario extends Funcionario {

    private double valorBolsaAuxilio;
    private int cargaHorariaSemanal;

    public Estagiario(String nome, int matricula, double salarioBase,
                      String dataAdmissao, double valorBolsaAuxilio,
                      int cargaHorariaSemanal) {

        super(nome, matricula, salarioBase, dataAdmissao);

        this.valorBolsaAuxilio = valorBolsaAuxilio;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    @Override
    public double calcularSalario() {
        return valorBolsaAuxilio;
    }

    @Override
    public double calcularDesconto() {
        return 0.00;
    }

    public double getValorBolsaAuxilio() {
        return valorBolsaAuxilio;
    }

    public void setValorBolsaAuxilio(double valorBolsaAuxilio) {
        this.valorBolsaAuxilio = valorBolsaAuxilio;
    }

    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }
}