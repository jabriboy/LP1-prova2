public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica pessoa = new PessoaFisica(0, "dbusaijk", "fisica", "6421848", "478392", new Fisica(2000, 2, 150, 200));

        pessoa.calculaImpostos();
    }
}
