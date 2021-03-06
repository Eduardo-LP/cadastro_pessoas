package dominio;

public class Mentora extends Pessoa{
    private String empresaQueTrabalha;
    private int anosDeExperiencia;
    private String tipo = "mentora";

    public Mentora(String nome, String dataDeNascimento, String cpf, String empresaQueTrabalha, int anosDeExperiencia){
        super(nome, dataDeNascimento, cpf);
        this.empresaQueTrabalha = empresaQueTrabalha;
        this.anosDeExperiencia = anosDeExperiencia;
    }

    public String getEmpresaQueTrabalha() {
        return empresaQueTrabalha;
    }

    public void setEmpresaQueTrabalha(String empresaQueTrabalha) {
        this.empresaQueTrabalha = empresaQueTrabalha;
    }

    public int getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setAnosDeExperiencia(int anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }
}
