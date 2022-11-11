public class PessoaFisica extends Pessoa{
    public String cpf;
    public String rg;

    public PessoaFisica(){}

    public PessoaFisica(int id, String nome, int tipoPessoa){
        super(id, nome, tipoPessoa = 0);
    }

    public PessoaFisica(int id, String nome, int tipoPessoa, String cpf, String rg){
        super(id, nome, tipoPessoa = 0);
        this.cpf = cpf;
        this.rg = rg;
    }

    public float calculaInss(float salario){
        float inss;
        inss = (float) (salario * 0.05);

        return inss;
    }

    public int calculaAliquota(float salario){
        int aliquota;

        if(salario <= 20000){
            aliquota = 10;
        }
        else if(salario < 40000){
            aliquota = 20;
        }
        else{
            aliquota = 30;
        }

        return aliquota;
    }

    public float calculaIr(float salario, int dependentes, float saude, float educacao){
        float ir, inss;
        int aliquota;
        inss = calculaInss(salario);
        aliquota = calculaAliquota(salario);
        
        ir = (float) (((salario - inss - (185.59 * dependentes)) * (aliquota/100)) - (saude + educacao)); 

        return ir;
    }

    public float calculaImposto(float salario, int dependentes, float saude, float educacao){
        float inss, ir, imposto;
        inss = calculaInss(salario);
        ir = calculaIr(salario, dependentes, saude, educacao);
        imposto = (inss + ir);

        return imposto;
    }
}
