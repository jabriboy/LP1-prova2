public class Juridica implements Imposto {
    public float lucro;

    public Juridica(){}

    public Juridica(float lucro){
        this.lucro = lucro;
    }

    @Override
    public float calculaInss() {
        float inss;
        inss = (float) (this.lucro * 0.09);

        return inss;
    }

    @Override
    public float calculaAliquota() {
        int aliquota;

        if(this.lucro <= 20000){
            aliquota = 10;
        }
        else if(this.lucro < 40000){
            aliquota = 20;
        }
        else{
            aliquota = 30;
        }

        return aliquota/100;
    }

    @Override
    public float calculaIr() {
        float inss, aliquota, ir;
        inss = calculaInss();
        aliquota = calculaAliquota();

        ir = ((this.lucro - inss) * aliquota);

        return ir;
    }
    
}
