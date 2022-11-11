public class PessoaJuridica extends Pessoa implements Imposto {
    public String cnpj;
    public String inscricaoEstadual;

    public PessoaJuridica(){}

    public PessoaJuridica(int id, String nome, int tipoPessoa){
        super(id, nome, tipoPessoa = 0);
    }

    public PessoaJuridica(int id, String nome, int tipoPessoa, String cnpj, String inscricaoEstadual){
        super(id, nome, tipoPessoa = 0);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public float calculaIss(float valorNotaFiscal) {
        float iss;
        iss = (float) (valorNotaFiscal * 0.05);
        return iss;
    }

    @Override
    public float calculaLr(float lucro) {
        float lucroReal;
        lucroReal = (float) (lucro * 0.15);
        return lucroReal;
    }

    @Override
    public float calculaInss(float lucro) {
        float inss;
        inss = (float) (lucro * 0.09);
        return inss;
    }

    @Override
    public int calculaAliquota(float lucro){
        int aliquota;

        if(lucro <= 20000){
            aliquota = 10;
        }
        else if(lucro < 40000){
            aliquota = 20;
        }
        else{
            aliquota = 30;
        }

        return aliquota;
    }

    @Override
    public float calculaIr(float lucro){
        float ir;
        float inss;
        int aliquota = calculaAliquota(lucro);

        inss = calculaInss(lucro);
        ir = (lucro - inss) * (aliquota/100);
        return ir;
    }

    public float calculaImposto(float valorNotaFiscal, float lucro){
        float iss, inss, lucroReal, ir, imposto;

        iss = calculaIss(valorNotaFiscal);
        inss =  calculaInss(lucro);
        lucroReal = calculaLr(lucro);
        ir = calculaIr(lucro);

        imposto = (iss + inss + lucroReal + ir);

        return imposto;
    }

}
