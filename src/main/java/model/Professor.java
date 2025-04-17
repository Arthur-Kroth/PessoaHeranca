package model;

public class Professor {
    private double salario;
    private String titulo;

    public Professor(double salario, String titulo) {
        this.salario = salario;
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public double calcularImposto() {
        return(getSalario() * 22.5);
    }
}
