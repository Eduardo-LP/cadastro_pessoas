package dominio;

public class Curso {
    private String nomeCurso;
    private String faculdade;
    private double notaInep;

    public Curso(String nomeCurso, String faculdade, double notaInep){
        this.nomeCurso = nomeCurso;
        this.faculdade = faculdade;
        this.notaInep = notaInep;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    public double getNotaInep() {
        return notaInep;
    }

    public void setNotaInep(double notaInep) {
        this.notaInep = notaInep;
    }

}
