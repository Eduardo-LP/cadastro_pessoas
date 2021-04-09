import dominio.Aluna;
import dominio.Mentora;
import dominio.Curso;
import dominio.Matricula;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        limpaTela();
        System.out.println("Para aluna digite 1, para mentor digite 2: ");
        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                System.out.println("podemos cadastrar uma aluna");
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
        System.out.println(mentora.getNome());
    }
        
    private static void criaAluna() {
        //pessoasAceleradora.add(//pessoaCriada);
    }
        
    private static void limpaTela() {
        System.out.print("\0g33[H\033[2J");
    }
}
