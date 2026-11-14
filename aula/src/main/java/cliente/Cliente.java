package cliente;

import java.util.Scanner;

public class Cliente {
    String nome;
    String celular;
    String dataNascimento; //2026-06-12
    String email;
    String endereco;
    String data_cadastro;
    Scanner leitor = new Scanner(System.in);

    public void cadastrarCliente(
    ){
        System.out.println("Informe os dados para cadastro:");
        System.out.println("Nome:");
        nome = leitor.nextLine();
        System.out.println("Celular:");
        celular = leitor.nextLine();
        System.out.println("Data de Nascimento aaaa-mm-dd:");
        dataNascimento = leitor.nextLine();
        System.out.println("E-mail:");
        email = leitor.nextLine();
        System.out.println("Endereço:");
        endereco = leitor.nextLine();
        System.out.println("Data de Cadastro:");
        data_cadastro = leitor.nextLine();


        System.out.println("✅ O cliente "+nome+" foi registrado com sucesso!");
        System.out.println("Cell: "+celular);
        System.out.println("Data de Nascimento: "+dataNascimento);
        System.out.println("E-mail: "+email);
        System.out.println("Endereço: "+endereco);
        System.out.println("Data do Cadastro: "+data_cadastro);

    }
}
