package model;

public class Aluno {
    private String curso;
    private int fase;

    public Aluno(String curso, int fase) {
        this.curso = curso;
        this.fase = fase;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
    
    public boolean verificarFormando( ) {
        if (this.fase == 10) {
            return true;
        } else {
            return false;
        }
    }
}
