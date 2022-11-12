public class Fisica implements Imposto {
    public float salario;
    public int dependente;
    public float saude;
    public float educacao;

    public Fisica(){}

    public Fisica(float salario, int dependente, float saude, float educacao){
        this.salario = salario;
        this.dependente = dependente;
        this.saude = saude;
        this.educacao = educacao;
    }

    @Override
    public float calculaInss() {
        float inss;
        inss = (float) (this.salario * 0.05);

        return inss;
    }

    @Override
    public float calculaAliquota() {
        int aliquota;

        if(this.salario <= 1000){
            aliquota = 13;
        }
        else if(this.salario <= 2000){
            aliquota = 20;
        }
        else{
            aliquota = 30;
        }

        return (float) aliquota/100;
    }

    @Override
    public float calculaIr() {
        float inss, aliquota, ir;
        inss = calculaInss();
        aliquota = calculaAliquota();

        ir = (float) ((this.salario - (this.dependente * 189.59) - inss) * aliquota) - (this.saude + this.educacao);

        return ir;
    }
    
}
