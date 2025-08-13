package br.com.mramos;

public class Notas {

    private String aluno;

    private double primeiroBimestre;

    private double segundoBimestre;

    private double terceiroBimestre;

    private double quartoBimestre;

    public String getAluno () {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public double getPrimeiroBimestre() {
        return primeiroBimestre;
    }

    public void setPrimeiroBimestre(double primeiroBimestre){
        this.primeiroBimestre = primeiroBimestre;
    }

    public double getSegundoBimestre () {
        return segundoBimestre;
    }

    public void setSegundoBimestre (double segundoBimestre) {
        this.segundoBimestre = segundoBimestre;
    }

    public double getTerceiroBimestre () {
        return terceiroBimestre;
    }

    public void setTerceiroBimestre (double terceiroBimestre) {
        this.terceiroBimestre = terceiroBimestre;
    }

    public double getQuartoBimestre () {
        return quartoBimestre;
    }

    public void setQuartoBimestre (double quartoBimestre) {
        this.quartoBimestre = quartoBimestre;
    }

    public double getMediaTotal() {
        return (primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre) / 4;
    }

    public String getMedias() {
        return "Aluno(a): " + aluno + " - Média Anual: " + getMediaTotal();
    }

}
