public class PessoaFisica extends Pessoa{
    public String cpf;
    public String rg;
    public Fisica fisica;

    public PessoaFisica(){}

    public PessoaFisica(int id, String nome, String tipoPessoa){
        super(id, nome, tipoPessoa);
    }

    public PessoaFisica(int id, String nome, String tipoPessoa, String cpf, String rg, Fisica fisica){
        super(id, nome, tipoPessoa);
        this.cpf = cpf;
        this.rg = rg;
        this.fisica = fisica;
    }

    public void calculaImpostos() {
        float inss, ir;
        inss = this.fisica.calculaInss();
        ir = this.fisica.calculaIr();

        System.out.println("INSS: "+inss);
        System.out.println("Imposto de Renda: "+ir);
    }
}
