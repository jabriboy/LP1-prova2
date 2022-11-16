import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int id = 0, dependente, i = 1;
        float salario, lucro, saude, educacao;
        String nome, tipoPessoa, cpf, rg, cnpj, inscricaoEstadual, lixo;

        Scanner sc = new Scanner(System.in);

        while(i == 1){
            id++;
            System.out.println("--- PESSOA FÍSICA ---");
            System.out.println("\n");
            System.out.println("Digite o nome do titular: ");
            nome = sc.nextLine();

            System.out.println("CPF: ");
            cpf = sc.nextLine();

            System.out.println("RG: ");
            rg = sc.nextLine();

            System.out.println("Salário: ");
            salario = sc.nextFloat();

            System.out.println("Quantidade de Dependentes: ");
            dependente = sc.nextInt();

            System.out.println("Gastos com Saude: ");
            saude = sc.nextFloat();

            System.out.println("Gastos com Educacao: ");
            educacao = sc.nextFloat();

            tipoPessoa = "Física";

            PessoaFisica pessoa = new PessoaFisica(id, nome, tipoPessoa, cpf, rg, new Fisica(salario, dependente, saude, educacao));

            System.out.println("\n");

            System.out.println("Impostos da PESSOA FÍSICA");
            pessoa.calculaImpostos();
            System.out.println("\n");

            id++;
            System.out.println("--- PESSOA JURIDICA ---");
            System.out.println("\n");
            lixo = sc.nextLine();
            System.out.println("Digite o nome da pessoa juridica: ");
            nome = sc.nextLine();

            System.out.println("CNPJ: ");
            cnpj = sc.nextLine();

            System.out.println("Inscricao Estadual: ");
            inscricaoEstadual = sc.nextLine();

            System.out.println("Lucro: ");
            lucro = sc.nextFloat();

            tipoPessoa = "Juridica";

            PessoaJuridica pessoaj = new PessoaJuridica(id, nome, tipoPessoa, cnpj, inscricaoEstadual, new Juridica(lucro));
            System.out.println("\n");

            System.out.println("Impostos da PESSOA JURIDICA");
            pessoaj.calculaImpostos();

            System.out.println("\n");

            System.out.println("Deseja continuar? \n[1] sim\n[0] nao");
            i = sc.nextInt();
            
        }
    }
}
