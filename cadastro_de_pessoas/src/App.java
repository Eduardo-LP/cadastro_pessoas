import dominio.Aluna;
import dominio.Mentora;
import dominio.Curso;
import dominio.Matricula;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static Scanner scanner = new Scanner(System.in);
    private static List<Curso> listaDeCursos = new ArrayList<>();
    public static void main(String[] args){
        Curso ES = new Curso("Engenharia de software", "PUCRS", 5);
        listaDeCursos.add(ES);
        Curso ADS = new Curso("ADS", "PUCRS", 4);
        listaDeCursos.add(ADS);
        //System.out.println(listaDeCursos.size());
        limpaTela();
        System.out.println("Para aluna digite 1, para mentor digite 2: ");
        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                criaAluna();
            break;

            case 2:
                criaMentor();
            break;

            default:
                System.out.println("escolha não encontrada.");
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

        int estadoDoVetor = 0;

        for(int i = 0; i <= listaDeCursos.size(); i++){
            if(nomeCurso != listaDeCursos.get(i).getNomeCurso()){
                estadoDoVetor = i;
            }else{
                Matricula matricula = new Matricula(numeroMatricula, dataInicio, listaDeCursos.get(i));
                Aluna aluna = new Aluna(nomeAluna, dataAluna, cpfAluna, semestreAluna, cadastroEstagio, matricula);
            }
        }
        Curso cursoNovo = new Curso(nomeCurso, nomeFaculdade, notaInep);
        listaDeCursos.add(cursoNovo);
        Matricula matricula = new Matricula(numeroMatricula, dataInicio, listaDeCursos.get(estadoDoVetor));
        Aluna aluna = new Aluna(nomeAluna, dataAluna, cpfAluna, semestreAluna, cadastroEstagio, matricula);
        
    }
        
    private static void limpaTela() {
        System.out.print("\0g33[H\033[2J");
    }
}
