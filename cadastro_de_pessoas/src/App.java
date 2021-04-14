import dominio.Aluna;
import dominio.Mentora;
import dominio.Curso;
import dominio.Matricula;
import dominio.Pessoa;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static Scanner scanner = new Scanner(System.in);
    private static List<Curso> listaDeCursos = new ArrayList<>();
    private static List<Pessoa> pessoasAceleradora = new ArrayList<>();

    public static void main(String[] args){
        Curso ES = new Curso("Engenharia de software", "PUCRS", 5);
        listaDeCursos.add(ES);
        Curso ADS = new Curso("ADS", "PUCRS", 4);
        listaDeCursos.add(ADS);
        //System.out.println(listaDeCursos.size());
        boolean loop = true;
        while(loop){
        limpaTela();
        System.out.println("Para cadastrar uma aluna digite 1\nPara cadastrar uma mentora digite 2\nPara ver a lista de pessoas da aceleradora, digite 3");
        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                criaAluna();
            break;

            case 2:
                criaMentor();
            break;

            case 3:
                limpaTela();
                loop = percorrePessoas();
            break;

            default:
                System.out.println("escolha não encontrada.");
        }
    }
    }

    //Syout => cria o comando que imprime no terminal

    private static void criaMentor() {
        limpaTela();
        System.out.println("Digite o nome da pessoa mentora: ");
        String nomeMentora = scanner.next();
        System.out.println("Digite a data de nascimento: ");
        String dataMentora = scanner.next();
        System.out.println("Digite o cpf: ");
        String cpfMentora = scanner.next();
        System.out.println("Digite a empresa que trabalha: ");
        String empresaMentora = scanner.next();
        System.out.println("Digite os anos de experiencia: ");
        int anosXpMentora = scanner.nextInt();
        Mentora mentora = new Mentora(nomeMentora, dataMentora, cpfMentora, empresaMentora, anosXpMentora);
        pessoasAceleradora.add(mentora);
    }
        
    private static void criaAluna() {
        limpaTela();
        System.out.println("Digite o nome da passoa aluna: ");
        String nomeAluna = scanner.next();
        System.out.println("Digite a data de nascimento: ");
        String dataAluna = scanner.next();
        System.out.println("Digite o cpf: ");
        String cpfAluna = scanner.next();

        System.out.println("Digite o semestre: ");
        String semestreAluna = scanner.next();
        System.out.println("Digite o cadastro do estagio: ");
        String cadastroEstagio = scanner.next();

        System.out.println("Digite o numero da matricula: ");
        String numeroMatricula = scanner.next();
        System.out.println("Digite a data de inicio: ");
        String dataInicio = scanner.next();

        System.out.println("Digite o nome do curso: ");
        String nomeCurso = scanner.next();
        System.out.println("Digite o nome da faculdade: ");
        String nomeFaculdade = scanner.next();
        System.out.println("Digite a nota do Inep: ");
        double notaInep = scanner.nextDouble();
        /*
        int estadoDoVetor = 0;
        int indexCurso = 0;
        boolean conseguiu = false;

        for(int i = 0; i <= listaDeCursos.size(); i++){
            if((nomeCurso == listaDeCursos.get(i).getNomeCurso()) && (nomeFaculdade == listaDeCursos.get(i).getFaculdade())){
                indexCurso = i;
                conseguiu = true;
            }
            estadoDoVetor++;
        }

        if(conseguiu == false){
            Curso cursoNovo = new Curso(nomeCurso, nomeFaculdade, notaInep);
            listaDeCursos.add(cursoNovo);
            Matricula matricula = new Matricula(numeroMatricula, dataInicio, listaDeCursos.get(estadoDoVetor + 1));
            Aluna aluna = new Aluna(nomeAluna, dataAluna, cpfAluna, semestreAluna, cadastroEstagio, matricula);
            pessoasAceleradora.add(aluna);
        }
        else{
            Matricula matricula = new Matricula(numeroMatricula, dataInicio, listaDeCursos.get(indexCurso));
            Aluna aluna = new Aluna(nomeAluna, dataAluna, cpfAluna, semestreAluna, cadastroEstagio, matricula);
            pessoasAceleradora.add(aluna);
        }
        */

        Curso cursoNovo = new Curso(nomeCurso, nomeFaculdade, notaInep);
        listaDeCursos.add(cursoNovo);
        Matricula matricula = new Matricula(numeroMatricula, dataInicio, cursoNovo);
        Aluna aluna = new Aluna(nomeAluna, dataAluna, cpfAluna, semestreAluna, cadastroEstagio, matricula);
        pessoasAceleradora.add(aluna);
    }
        
    private static void limpaTela() {
        System.out.print("\0g33[H\033[2J");
    }

    public static boolean percorrePessoas(){
        for (int i=0; i<pessoasAceleradora.size(); i++){
            String pessoaNome = pessoasAceleradora.get(i).getNome();
            System.out.println(pessoaNome);
        }
        System.out.println("Deseja voltar ao menu inicial? 1 para sim, 2 para não.");
        int opcao = scanner.nextInt();
        if(opcao == 1){
            return true;
        }else{
            return false;
        }
    }
}
