package model;
import javax.swing.*;

public class Pessoa {
    private int id;
    private int idade;
    private String nome;

    public Pessoa(int id, int idade, String nome) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void fazerAniversario() {
        
    }
    
    public void mostrarDados() {
        JOptionPane.showMessageDialog(null,"nome: " + nome + " idede: " + idade + " id: " + id);
    }
    
}
