package planos;

import java.util.Scanner;

public class Plano {
    String regraPeriodo;
    Double valorBase;

    String[] plano = {"Mensal" , "Semestreal" , "Anual"};
    Double[] precosPlanos = {56.23, 169.56, 256.23};

    
    public void exibirCatalogoPlanos() {
        System.out.println(plano[0] + " - R$" + precosPlanos[0]);
        System.out.println(plano[1] + " - R$" + precosPlanos[1]);
        System.out.println(plano[2] + " - R$" + precosPlanos[2]);

        Scanner input_planoContratado = new Scanner(System.in);
        String planoEscolhido = input_planoContratado.nextLine();
        //System.out.println("Informe o plano que gostaria de contratar, temos:\n"+plano[0]+" R$"+precosPlanos[0]+"\n"+plano[1]+" R$"+precosPlanos[1]+"\n"+plano[2]+" R$"+precosPlanos[2]);


        System.out.println("Plano Contratado: "+ planoEscolhido);

        Double porcentagem_desconto;
        Double desconto;
        Double mensalidade;

        if(planoEscolhido.equals("Anual")){
            porcentagem_desconto = 0.2;
            desconto = precosPlanos[2] * porcentagem_desconto;
            mensalidade = precosPlanos[2] - desconto;
            System.out.println("Você possui acesso liberado os produtos premiuns");
            System.out.println("você tem direito a "+ desconto + " desconto o valor total é: R$"+ mensalidade); // 2%
        } else {
            System.out.println("Infelimente não é possível fornecer desconto");
        }

    }

}
