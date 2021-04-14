package dominio;

public class Aluna extends Pessoa {
    private String semestre;
    private String cadastroEstagio;
    private Matricula matricula;
    private String tipo = "aluna";

    public Aluna(String nome, String dataDeNascimento, String cpf, String semestre, String cadastroEstagio, Matricula matricula){
        super(nome, dataDeNascimento, cpf);
        this.semestre = semestre;
        this.cadastroEstagio = cadastroEstagio;
        this.matricula = matricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCadastro() {
        return cadastroEstagio;
    }

    public void setcadastroEstagio(String cadastroEstagio) {
        this.cadastroEstagio = cadastroEstagio;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

}
