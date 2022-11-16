import java.util.Scanner;

public class PessoaJuridica extends Pessoa{
    public String cnpj;
    public String inscricaoEstadual;
    public Juridica juridica;

    Scanner sc = new Scanner(System.in);

    public PessoaJuridica(){}

    public PessoaJuridica(int id, String nome, String tipoPessoa){
        super(id, nome, tipoPessoa);
    }

    public PessoaJuridica(int id, String nome, String tipoPessoa, String cnpj, String inscricaoEstadual, Juridica juridica){
        super(id, nome, tipoPessoa);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.juridica = juridica;
    }

    public float calculaIss(float valorNotaFiscal) {
        float iss;
        iss = (float) (valorNotaFiscal * 0.05);

        return iss;
    }

    public float calculaLr() {
        float lr;
        lr = (float) (this.juridica.lucro * 0.15);

        return lr;
    }

    public void calculaImpostos() {
        float iss, lr, inss, ir, valorNotaFiscal;
        System.out.print("Valor das notas fiscais: ");
        valorNotaFiscal = sc.nextFloat();

        iss = calculaIss(valorNotaFiscal);
        lr = calculaLr();
        inss = this.juridica.calculaInss();
        ir = this.calculaLr();

        System.out.println("\n");
        System.out.println("ISS: "+iss);
        System.out.println("Lucro Real: "+lr);
        System.out.println("INSS: "+inss);
        System.out.println("Imposto de Renda: "+ir);
    }

}
