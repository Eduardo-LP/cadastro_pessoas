package dominio;

public class Aluna extends Pessoa {
    private String semestre;
    private String cadastro;
    private Matricula matricula;

    public Aluna(String nome, String dataDeNascimento, String cpf, String semestre, String cadastro, Matricula matricula){
        super(nome, dataDeNascimento, cpf);
        this.semestre = semestre;
        this.cadastro = cadastro;
        this.matricula = matricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

}
