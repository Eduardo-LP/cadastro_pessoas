package dominio;

public class Matricula {
    private String numeroDeMatricula;
    private String dataDeInicio;
    private Curso curso;

    public Matricula(String numeroDeMatricula, String dataDeInicio, Curso curso){
        this.numeroDeMatricula = numeroDeMatricula;
        this.dataDeInicio = dataDeInicio;
        this.curso = curso;
    }

    public String getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(String numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public String getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(String dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
