
import java.util.Scanner;
public class AULA01 {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        String nome;
        String idade;
        String celular;
        String dataNascimento;
        String endereco;
        String email;

        Scanner usuario_nome = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = usuario_nome.nextLine();
        System.out.println("nome informado: " + nome);
        
        Scanner usuario_idade = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = usuario_idade.nextLine();
        System.out.println("idade informada: " + idade);
        
        Scanner usuario_celular = new Scanner(System.in);
        System.out.println("Digite seu celular: ");
        celular = usuario_celular.nextLine();
        System.out.println("celular informado: " + celular);
        
        Scanner usuario_dataNascimento = new Scanner(System.in);
        System.out.println("Digite sua data de nascimento: ");
        dataNascimento = usuario_dataNascimento.nextLine();
        System.out.println("data de nascimento informada: " + dataNascimento);

        Scanner usuario_endereco = new Scanner(System.in);
        System.out.println("Digite seu endereço: ");
        endereco = usuario_endereco.nextLine();
        System.out.println("endereço informado: " + endereco);

        Scanner usuario_email = new Scanner(System.in);
        System.out.println("Digite seu email: ");
        email = usuario_email.nextLine();
        System.out.println("email informado: " + email);

        

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Celular: " + celular);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);

        System.out.println("O cliente " + nome + " foi registrado com sucesso!");

        
    }
}