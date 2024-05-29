public class App {
    public static void main(String[] args) throws Exception {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(100);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(1);

        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.calcularSoma());

        System.out.println(somaNumeros.encontrarMaiorNumero());

        System.out.println(somaNumeros.encontrarMenorNumero());
    }
}
