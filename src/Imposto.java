public interface Imposto {
    public float calculaIss(float valorNotaFiscal);
    public float calculaLr(float lucro);
    public float calculaInss(float lucro);
    public int calculaAliquota(float lucro);
    public float calculaIr(float lucro);
}
